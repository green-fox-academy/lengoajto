import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers!");
        int a=input.nextInt();
        int b=input.nextInt();
        if (a>b) {
            System.out.println(a);
        }
        else if (a<b) {
            System.out.println(b);
        }


        // Write a program that asks for two numbers and prints the bigger one
    }
}