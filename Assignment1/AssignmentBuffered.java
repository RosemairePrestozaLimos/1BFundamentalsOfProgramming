package Assignment1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AssignmentBuffered {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the year: ");

        try {
           int year =Integer.parseInt(br.readLine());

            if(year%4==0){
                System.out.println(year + " is a leap year");
            }else{
                System.out.println(year + " is not a leap year");
            }
        }catch (IOException e){
            System.out.println("Error");
        }
    }
}
