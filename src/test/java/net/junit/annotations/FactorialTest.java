package net.junit.annotations;

import net.junit.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorialTest() {
        Factorial factorial = new Factorial();

        int actualResult = factorial.factorial(5);
        assertEquals(120, actualResult);
    }
}