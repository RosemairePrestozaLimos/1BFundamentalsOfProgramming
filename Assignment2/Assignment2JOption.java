package Assignment2;
import javax.swing.JOptionPane;

public class Assignment2JOption {
    public static void main (String [] args){

        String input = JOptionPane.showInputDialog("Enter hourly pay rate: ");
        double rate = Double.parseDouble(input);

        String sc = JOptionPane.showInputDialog("Enter hourly worked: ");
        double hours = Double.parseDouble(sc);

        double GrossPay = rate * hours;
        double taxRate;

        if (GrossPay <= 2000){
            taxRate = 0.10;
        }else if (GrossPay <= 4000){
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
    }
}
