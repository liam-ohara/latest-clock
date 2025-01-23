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
}