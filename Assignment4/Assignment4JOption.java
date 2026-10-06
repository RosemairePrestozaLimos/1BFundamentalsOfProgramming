package Assignment4;
import javax.swing.JOptionPane;

public class Assignment4JOption {
    public static void main(String[] args) {

        String msg = "Jed Knight Military Academy";
        JOptionPane.showMessageDialog(null, msg);

        String input1 = JOptionPane.showInputDialog("Height(cm): ");
        double height = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Age: ");
        int Age = Integer.parseInt(input2);

        String input3 = JOptionPane.showInputDialog("Enter citizenship code (C/N): ");
        char Citizenship = input3.charAt(0);

        String input4 = JOptionPane.showInputDialog("Enter recommendee code (R/N): ");
        char Recommendee = input4.charAt(0);

        if (height >= 200 && Age>= 21 &&  Age <= 25 && Citizenship == 'C' && Recommendee == 'R' ) {
            System.out.println("Accepted");
        }else{
            System.out.println("Rejected");
        }
    }
}
