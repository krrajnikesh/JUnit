package net.junit.suite;

import net.junit.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassATest {

    @Test
    void testClassATest(){
        System.out.println("Class A method test!");
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }
}
