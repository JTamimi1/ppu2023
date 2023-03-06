package herbawi.wesam;

public class AverageExpert {
    private SumExpert sumExpert;
    public AverageExpert(SumExpert sumExpert) {
        this.sumExpert = sumExpert;
    }



    public double avg(int... a) {
        return sumExpert.sum(a) / a.length;
    }
}
