package liamohara;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main = new Main();

    @Test
    @DisplayName("Returns 00:00 when given four zeros as an input")
    void testMakeLatestClock_WhenGivenFourZeros() {

        //Arrange
        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;
        int fourthDigit = 0;
        String expected = "00:00";

        //Act

        String result = Main.makeLatestClock(firstDigit, secondDigit, thirdDigit,fourthDigit);

        //Assert
        assertEquals(expected, result);

    }
}