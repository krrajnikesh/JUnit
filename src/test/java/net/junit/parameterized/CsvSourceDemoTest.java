package net.junit.parameterized;

import net.junit.MathUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvSourceDemoTest {

    @ParameterizedTest
    @CsvSource({"0, 1", "1, 1", "2, 2", "3, 6", "4, 24"})
    void factorialTest(int number, int expected){
        MathUtils mathUtils = new MathUtils();

        assertEquals(expected, mathUtils.factorial(number));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/factorial_data.csv")
    void factorialTestUsingCsvFileSource(int number, int expected){
        MathUtils mathUtils = new MathUtils();

        assertEquals(expected, mathUtils.factorial(number));
    }
}
