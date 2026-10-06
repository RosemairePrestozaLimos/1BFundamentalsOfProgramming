package Assignment2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assignment2Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter hourly pay rate: ");
            double rate = sc.nextDouble();
            System.out.print("Enter hours worked: ");
            double hours = sc.nextDouble();

            double GrossPay = rate * hours;
            double taxRate;

            if (GrossPay <= 2000){
                taxRate = 0.10;
            }else if(GrossPay <= 4000){
                taxRate = 0.12;
            }else if(GrossPay <= 10000){
                taxRate = 0.15;
            }else{
                taxRate = 0.20;
            }
            double withHoldingTax = GrossPay * taxRate;
            double netPay = GrossPay - withHoldingTax;

            System.out.println(" GrossPay: php " + GrossPay );
            System.out.println(" withHoldingTax : php " + withHoldingTax );
            System.out.println(" netPay: php " + netPay );

        }catch(InputMismatchException e){
            System.out.println("Error");
        }finally{
            sc.close();
        }
    }
}
