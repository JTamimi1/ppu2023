package herbawi.wesam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    @GetMapping("/message")
    public String message(){
        return "Welcome to ! Ma3ali Virtual Machine.\n Work is done" ;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        SumExpert sumExpert = new SumExpert();
//        AverageExpert averageExpert = new AverageExpert(sumExpert);
//        DivisionExpert divisionExpert =new DivisionExpert();
//        System.out.println("sum = " + sumExpert.sum(numbers));
//        System.out.println("average= "+ averageExpert.avg(numbers));
//        System.out.println(numbers[3]+"/" + numbers[1] + "= " +  divisionExpert.divide(numbers[3],numbers[1]));
        SpringApplication.run(Main.class, args);
    }
}