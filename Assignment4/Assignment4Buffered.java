package Assignment4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment4Buffered {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Jed Knight Military Academy");
        System.out.println();

        System.out.print("Height(cm): ");
        double height = Double.parseDouble(br.readLine());

        System.out.print("Age: ");
        int Age = Integer.parseInt(br.readLine());

        System.out.print("Enter citizenship code (C/N): ");
        char Citizenship =br.readLine().charAt(0);

        System.out.print("Enter recommendee code (R/N): ");
        char Recommendee = br.readLine().charAt(0);

        if (height >= 200 && Age>= 21 &&  Age <= 25 && Citizenship == 'C' && Recommendee == 'R' ) {
            System.out.println("Accepted");
        }else{
            System.out.println("Rejected");
        }
    }
}
