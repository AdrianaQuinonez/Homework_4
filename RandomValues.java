package Homework_4;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;


public class RandomValues{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random rand = new Random();
        double[] arrays = new double[50];

        for(int i = 0; i < arrays.length; i++){
            arrays[i] = Math.random() * 50;
        }
        try{
            System.out.println("Enter a index from 0 to 49");
            int index = scan.nextInt();
            System.out.println("The value at index " + index + " is " + arrays[index]);
        } catch(InputMismatchException e){
            System.out.println("Invalid input");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }

    }
}
