import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 numbers! Then hit enter!");
        int a =input.nextInt();
        int b =input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int e=input.nextByte();
        int sum= a+b+c+d+e;
        double average=sum/2;
        System.out.println("Sum: " + sum +", " + "Average: " + average);



     // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4

    }
}

