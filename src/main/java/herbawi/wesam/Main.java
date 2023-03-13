package herbawi.wesam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        SumExpert sumExpert = new SumExpert();
        AverageExpert averageExpert = new AverageExpert(sumExpert);
        DivisionExpert divisionExpert =new DivisionExpert();
        System.out.println("sum = " + sumExpert.sum(numbers));
        System.out.println("average= "+ averageExpert.avg(numbers));
        System.out.println(numbers[3]+"/" + numbers[1] + "= " +  divisionExpert.divide(numbers[3],numbers[1]));
        SpringApplication.run(Main.class, args);
    }
}