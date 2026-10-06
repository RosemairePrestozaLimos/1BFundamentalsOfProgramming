package Assignment2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Assignment2Buffered {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Enter hourly pay rate: ");
        double rate = Double.parseDouble(br.readLine());

        System.out.print("Enter hours worked: ");
        double hours = Double.parseDouble(br.readLine());

        double GrossPay = rate * hours;
        double taxRate;

        if(GrossPay <= 2000){
            taxRate = 0.10;
        }else if (GrossPay <= 4000){
            taxRate = 0.12;
        }else if (GrossPay <= 10000){
            taxRate = 0.15;
        }else {
            taxRate = 0.20;
        }

        double withHoldingTax = GrossPay * taxRate;
        double netPay = GrossPay - withHoldingTax;

        System.out.println("Gross Pay: Php " + GrossPay);
        System.out.println("Withholding Tax: Php " + withHoldingTax);
        System.out.println("Net Pay: Php " + netPay);




    }
}
