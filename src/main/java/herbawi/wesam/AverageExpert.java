package herbawi.wesam;

public class AverageExpert {
    public AverageExpert(SumExpert sumExpert) {
        this.sumExpert = sumExpert;
    }

    private SumExpert sumExpert;

    public double avg(int... a) {
        return sumExpert.sum(a) / a.length;
    }
}
