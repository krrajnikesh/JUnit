package net.junit.annotations;

import net.junit.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Operation Test")
public class CalculatorTest {

    @DisplayName("Test Addition of 2 number")
    @Disabled
    @Test
    void addTest(){
        Calculator calculator = new Calculator();
        int addition = calculator.add(2,3);

        assertEquals(5, addition);
    }
}
