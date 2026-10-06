package Assignment4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assignment4Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jed Knight Military Academy");
        System.out.println();

        System.out.print("Height(cm): ");
        double height = sc.nextDouble();

        System.out.print("Age: ");
        int Age = sc.nextInt();

        System.out.print("Enter citizenship code (C/N): ");
        char Citizenship = sc.next().charAt(0);

        System.out.print("Enter recommendee code (R/N): ");
        char Recommendee = sc.next().charAt(0);

        if (height >= 200 && Age>= 21 &&  Age <= 25 && Citizenship == 'C' && Recommendee == 'R' ) {
            System.out.println("Accepted");
        }else{
            System.out.println("Rejected");
        }


    }
}
