package net.junit.parameterized;

import net.junit.Days;
import net.junit.MathUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnumSourceDemoTest {

    @ParameterizedTest
    @EnumSource(value = Days.class, names = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"})
    void isWeekDayTest(Days day){
        MathUtils mathUtils = new MathUtils();

        assertTrue(mathUtils.isWeekday(day));
    }

}
