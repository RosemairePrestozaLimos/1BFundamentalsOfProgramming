package Assignment3;
import javax.swing.JOptionPane;

public class Assignment3JOption {
    public static void main(String[] args) {
         String input = JOptionPane.showInputDialog("Enter NSAT score: ");
         double NSAT = Double.parseDouble(input);

         String input1 = JOptionPane.showInputDialog("Enter Parents' monthly Salary: ");
         double Salary = Double.parseDouble(input1);

         String input2 = JOptionPane.showInputDialog("Enter entrance Examination score: ");
         double entranceExamination = Double.parseDouble(input2);

        double salary = 0;
        double average = (NSAT + entranceExamination) / 2;

        if (salary > 10000 || NSAT < 90 || entranceExamination < 85) {
            System.out.println("Rejected");
        } else if (salary <= 3500 && entranceExamination >= 91) {
            System.out.println("Accepted");
        } else {
            System.out.println("For further study");
        }
    }
}
