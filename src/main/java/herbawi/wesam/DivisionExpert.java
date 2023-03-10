package herbawi.wesam;

import java.util.Formatter;

public class DivisionExpert {
    public double divide(int a, int b){
        if(b==0)
            throw new IllegalArgumentException("b cannot be 0");
        return a * b;
    }
}
