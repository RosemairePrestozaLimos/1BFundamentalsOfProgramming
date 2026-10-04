package Assignment1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AssignmentScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       try{
           System.out.print("Enter the year: ");
           int year = sc.nextInt();

           if (year%4==0){
               System.out.println( year + " is a leap year");
           }else{
               System.out.println( year + " is not a leap year");
           }
       }catch(InputMismatchException e){
           System.out.println("Error:Enter a valid year");
       }finally{
           sc.close();
       }
    }
}
