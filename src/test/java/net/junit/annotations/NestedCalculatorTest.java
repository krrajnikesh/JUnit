package net.junit.annotations;

import net.junit.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NestedCalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Nested
    class AdditionTests {

        @Test
        void testAddPositiveNumbers(){
            assertEquals(5, calculator.add(3,2));
        }

        @Test
        void testAddPositiveAndNegativeNumbers(){
            assertEquals(1, calculator.add(3,-2));
        }
    }

    @Nested
    class SubtractionTests {

        @Test
        void testSubtractPositiveNumbers(){
            assertEquals(1, calculator.subtract(3,2));
        }

        @Test
        void testSubtractPositiveAndNegativeNumbers(){
            assertEquals(5, calculator.subtract(3,-2));
        }
    }
}
