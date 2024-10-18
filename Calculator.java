package Homework_4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter 2 number");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int sum = number1 + number2;
            System.out.println("The sum is: " + sum);

        }
        catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("The input is not valid");
        }


    }
}
