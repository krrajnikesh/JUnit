package net.junit.parameterized;

import net.junit.MathUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ValueSourceUnitTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void isEvenTest(int number){
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hello", "JUnit", "Parameterized", "Test"})
    void  valueSourceTest(String str){
        assertNotNull(str);
    }

}
