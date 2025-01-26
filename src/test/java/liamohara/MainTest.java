package liamohara;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MainTest {

    @Mock
    Main mockMain;

    @Mock
    BufferedReader mockBufferedReader;

    @BeforeEach
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

    }

    String provideMultipleInputs(ArrayList<Integer> data) {

        String mockConsoleInput;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < data.size(); i++) {
            stringBuilder.append(data.get(i)).append("\n");

        }

        mockConsoleInput = stringBuilder.toString();
        ByteArrayInputStream testIn = new ByteArrayInputStream(mockConsoleInput.getBytes());
        System.setIn(testIn);
        return mockConsoleInput;

    }

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
        String expected = "09:09";

        String result = Main.makeLatestClock(firstDigit, secondDigit, thirdDigit,fourthDigit);

        assertEquals(expected, result);

    }

    @Test
    @DisplayName("Returns standard greeting and latest clock when provided with valid inputs")
    void testUserPrompt_WhenValidInputs() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        int firstDigit = 9;
        int secondDigit = 3;
        int thirdDigit = 2;
        int fourthDigit = 5;

        ArrayList<Integer> mockConsoleInputs = new ArrayList<>();
        mockConsoleInputs.add(firstDigit);
        mockConsoleInputs.add(secondDigit);
        mockConsoleInputs.add(thirdDigit);
        mockConsoleInputs.add(fourthDigit);

        String welcome = "==Latest Clock==\n----------------\nReturns the latest valid time based on your input of four digits.\n";
        String promptOne = "Please enter digit #1: \n";
        String promptTwo = "Please enter digit #2: \n";
        String promptThree = "Please enter digit #3: \n";
        String promptFour = "Please enter digit #4: \n";
        String resultLine = "The latest valid time possible with those four digits is: ";
        String latestTime = "23:59\n";
        String expected = "";

        expected = String.valueOf(welcome) + promptOne + promptTwo + promptThree + promptFour + resultLine + latestTime;

        when(mockBufferedReader.readLine()).thenReturn(provideMultipleInputs(mockConsoleInputs));

        Main.userPrompt();

        assertEquals(expected,outContent.toString());

        System.setOut(originalOut);

    }
}