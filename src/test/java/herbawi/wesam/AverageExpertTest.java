package herbawi.wesam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AverageExpertTest {
    @Test
    public void testAvg(){
        SumExpert sumExpert = mock(SumExpert.class);
        when(sumExpert.sum(5,5,5,5)).thenReturn(20);

        AverageExpert averageExpert = new AverageExpert(sumExpert);

        double r = averageExpert.avg(5,5,5,5);

        assertEquals(5,r);
    }

}