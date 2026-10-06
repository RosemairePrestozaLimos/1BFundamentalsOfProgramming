package Assignment3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment3Buffered {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT score: ");
        try {
            double NSAT = Double.parseDouble(br.readLine());

            System.out.print("Enter Parents' monthly Salary: ");
            double Salary = Double.parseDouble(br.readLine());

            System.out.print("Enter entrance Examination score: ");
            double entranceExamination = Double.parseDouble(br.readLine());

            double salary = 0;
            double average = (NSAT + entranceExamination) / 2;

            if (salary > 10000 || NSAT < 90 || entranceExamination < 85) {
                System.out.println("Rejected");
            } else if (salary <= 3500 && entranceExamination >= 91) {
                System.out.println("Accepted");
            } else {
                System.out.println("For further study");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }finally {
            br.close();
        }
    }
}
