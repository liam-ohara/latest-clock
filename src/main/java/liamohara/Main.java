package liamohara;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }


    public static String makeLatestClock(int firstDigit, int secondDigit, int thirdDigit, int fourthDigit) {

        String latestClock = "00:00";
        String hour = "";
        String minute = "";
        String separator = ":";

        hour = Integer.toString(firstDigit) + Integer.toString(secondDigit);
        minute = Integer.toString(thirdDigit) + Integer.toString(fourthDigit);

        StringBuilder b = new StringBuilder();
        b.append(hour).append(separator).append(minute);
        latestClock = b.toString();

        return latestClock;
    }


}