package herbawi.wesam;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        SumExpert sumExpert = new SumExpert();
        AverageExpert averageExpert = new AverageExpert(sumExpert);
        DivisionExpert divisionExpert =new DivisionExpert();
        System.out.println("sum = " + sumExpert.sum(numbers));
        System.out.println("average= "+ averageExpert.avg(numbers));
        System.out.println(numbers[3]+"/" + numbers[1] + "= " +  divisionExpert.divide(numbers[3],numbers[1]));
        System.out.println("Heloo Bro !");
        System.out.println("Conflict_Obada !!");
    }
}