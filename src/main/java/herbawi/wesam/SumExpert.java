package herbawi.wesam;

import static java.util.Arrays.stream;

public class SumExpert {
    public int sum(int... a){
        return stream(a).sum();
    }
}
