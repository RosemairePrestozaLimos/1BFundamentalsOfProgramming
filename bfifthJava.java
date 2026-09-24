package Block;
import java.util.Scanner;
import java.util.InputMismatchException;

public class bfifthJava {
    public static void main(String[] args) {
        String Name;
        int Age;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        System.out.println("Your name " + name + " and your age " + age + " years old.");

    }catch(InputMismatchException e){
        System.out.println("Error:Age must be a whole number.");
    }finally {
            sc.close();

        } }
}
