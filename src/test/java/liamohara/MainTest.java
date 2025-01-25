package liamohara;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main = new Main();

    @Test
    @DisplayName("Returns 00:00 when given four zeros as an input")
    void testMakeLatestClock_WhenGivenFourZeros() {

        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;
        int fourthDigit = 0;
        String expected = "00:00";

        String result = Main.makeLatestClock(firstDigit, secondDigit, thirdDigit,fourthDigit);

        assertEquals(expected, result);

    }

    @Test
    @DisplayName("Returns 11:11 when given four ones as an input")
    void testMakeLatestClock_WhenGivenFourOnes() {

        int firstDigit = 1;
        int secondDigit = 1;
        int thirdDigit = 1;
        int fourthDigit = 1;
        String expected = "11:11";

        String result = Main.makeLatestClock(firstDigit, secondDigit, thirdDigit,fourthDigit);

        assertEquals(expected, result);

    }


    @Test
    @DisplayName("Returns 22:22 when given four twos as an input")
    void testMakeLatestClock_WhenGivenFourTwos() {

        int firstDigit = 2;
        int secondDigit = 2;
        int thirdDigit = 2;
        int fourthDigit = 2;
        String expected = "22:22";

        String result = Main.makeLatestClock(firstDigit, secondDigit, thirdDigit,fourthDigit);

        assertEquals(expected, result);

    }

    @Test
    @DisplayName("Returns 23:59 when given 9, 3, 2, 5 as inputs")
    void testMakeLatestClock_WhenGivenNineThreeTwoFive() {

        int firstDigit = 9;
        int secondDigit = 3;
        int thirdDigit = 2;
        int fourthDigit = 5;
        String expected = "23:59";

        String result = Main.makeLatestClock(firstDigit, secondDigit, thirdDigit,fourthDigit);

       assertEquals(expected, result);

    }

    @Test
    @DisplayName("Returns 00:09 when given four nines as inputs")
    void testMakeLatestClock_WhenGivenFourNines() {

        int firstDigit = 9;
        int secondDigit = 9;
        int thirdDigit = 9;
        int fourthDigit = 9;
        String expected = "00:09";

        String result = Main.makeLatestClock(firstDigit, secondDigit, thirdDigit,fourthDigit);

        assertEquals(expected, result);

    }


}