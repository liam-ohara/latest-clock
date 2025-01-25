package liamohara;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {


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