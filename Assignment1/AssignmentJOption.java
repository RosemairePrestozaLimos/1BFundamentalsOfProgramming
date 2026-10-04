package Assignment1;
import javax.swing.JOptionPane;

public class AssignmentJOption {
    public static void main (String [] args){

        String input = JOptionPane.showInputDialog("Enter the year: ");

            int year = Integer.parseInt(input);
            if (year % 4 == 0) {
                JOptionPane.showMessageDialog(null, year + " is a leap year");
            } else {
                JOptionPane.showMessageDialog(null, year + " is not a leap year");
            }
        }
    }

