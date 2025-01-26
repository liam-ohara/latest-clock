package liamohara;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        userPrompt();

    }


    public static void userPrompt() throws IOException {
        System.out.println("==Latest Clock==\n----------------\nReturns the latest valid time based on your input of four digits.");

        int temp = 0;
        int[] digitArray = new int[4];
        String latestTime = "";
        boolean isInvalidEntry = true;

        while (isInvalidEntry) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

                for (int i = 0; i < 4; i++) {
                    System.out.println("Please enter digit #" + (i + 1) + ": ");
                    temp = Integer.parseInt(bufferedReader.readLine());
                    if (temp >= 0 && temp <= 9) {
                        digitArray[i] = temp;
                    } else {
                        throw new NumberFormatException();
                    }
                }

                isInvalidEntry = false;

            } catch (NumberFormatException e) {
                System.out.println("Invalid entry. Please only enter single positive digits.\nInput will now reset from the start.\n");
                isInvalidEntry = true;
                temp = 0;
                digitArray[0] = 0;
                digitArray[1] = 0;
                digitArray[2] = 0;
                digitArray[3] = 0;
                latestTime = "";
             }

        }



        latestTime = makeLatestClock(digitArray[0], digitArray[1], digitArray[2], digitArray[3]);

        System.out.println("The latest valid time possible with those four digits is: " + latestTime);
    }


    public static String makeLatestClock(int firstDigit, int secondDigit, int thirdDigit, int fourthDigit) {

        String latestClock = "00:00";
        String hour = "";
        String minute = "";
        String separator = ":";
        Integer[] digits = {firstDigit, secondDigit, thirdDigit, fourthDigit};
        int firstHourDigit = 0;
        int secondHourDigit = 0;
        int firstMinuteDigit = 0;
        int secondMinuteDigit = 0;

        Arrays.sort(digits, Collections.reverseOrder());

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < 3) {
                firstHourDigit = digits[i];
                digits[i] = 0;
                i = digits.length;
            }
        }

        Arrays.sort(digits, Collections.reverseOrder());

        for (int i = 0; i < digits.length; i++) {
            if (firstHourDigit == 2 && digits[i] < 5) {
                secondHourDigit = digits[i];
                digits[i] = 0;
                i = digits.length;

            } else if (firstHourDigit < 2 && digits[i] <= 9) {
                secondHourDigit = digits[i];
                digits[i] = 0;
                i = digits.length;
            }
        }

        Arrays.sort(digits, Collections.reverseOrder());

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] <= 5) {
                firstMinuteDigit = digits[i];
                digits[i] = 0;
                i = digits.length;
            }
        }

        Arrays.sort(digits, Collections.reverseOrder());

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] <= 9) {
                secondMinuteDigit = digits[i];
                digits[i] = 0;
                i = digits.length;
            }
        }

        StringBuilder hourString = new StringBuilder();
        hourString.append(Integer.toString(firstHourDigit)).append(Integer.toString(secondHourDigit));
        hour = hourString.toString();

        StringBuilder minuteString = new StringBuilder();
        minuteString.append(Integer.toString(firstMinuteDigit)).append(Integer.toString(secondMinuteDigit));
        minute = minuteString.toString();


        StringBuilder b = new StringBuilder();
        b.append(hour).append(separator).append(minute);
        latestClock = b.toString();

        return latestClock;
    }
}