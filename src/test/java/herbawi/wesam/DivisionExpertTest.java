package herbawi.wesam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionExpertTest {
    @Test
    public void testDivision() {
        DivisionExpert divisionExpert = new DivisionExpert();

        double r = divisionExpert.divide(10, 2);

        assertEquals(5, r);
    }

    @Test
    public void testDivisionZeroDeno() {
        DivisionExpert divisionExpert = new DivisionExpert();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            divisionExpert.divide(10, 0);
        });
    }

}