import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        double kilometer;
        double miles;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value of kilometer: ");
        kilometer = input.nextDouble();
        miles = kilometer * 1.6;
        System.out.println(kilometer + " kilometer is " + miles + " miles");


        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
    }
}