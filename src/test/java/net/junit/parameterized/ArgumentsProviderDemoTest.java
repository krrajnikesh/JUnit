package net.junit.parameterized;

import net.junit.MathUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgumentsProviderDemoTest {

    @ParameterizedTest
    @ArgumentsSource(FactorialArgumentsTest.class)
    void factorialTest(int number, int expected){
        MathUtils mathUtils = new MathUtils();

        assertEquals(expected, mathUtils.factorial(number));
    }
}
