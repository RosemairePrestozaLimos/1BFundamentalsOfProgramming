package Assignment3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assignment3Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter NSAT score: ");
        double NSAT = sc.nextDouble();

        System.out.print("Enter Parents' monthly Salary: ");
        double Salary = sc.nextDouble();

        System.out.print("Enter entrance Examination score: ");
        double entranceExamination = sc.nextDouble();

        double salary = 0;
        double average = (NSAT + entranceExamination)/2;

        if (salary > 10000 || NSAT < 90 || entranceExamination < 85) {
            System.out.println("Rejected");
        }else if(salary <= 3500 && entranceExamination >= 91) {
            System.out.println("Accepted");
        }else{
            System.out.println("For further study");
        }
        sc.close();
    }
}
