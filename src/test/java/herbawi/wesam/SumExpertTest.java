package herbawi.wesam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumExpertTest {
    @Test
    public void testItSumsCorrectly() {

        SumExpert sumExpert = new SumExpert();
        int sum = sumExpert.sum(5, 5, 5, 5);

        assertEquals(20, sum);

    }
    @Test
    public void testItSumsCorrectlyWithNegatives() {

        SumExpert sumExpert = new SumExpert();
        int sum = sumExpert.sum(5, -5, -5, 5);

        assertEquals(0, sum);

    }

}