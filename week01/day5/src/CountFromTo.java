import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers!");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a >= b) {
            System.out.println("The second number should be bigger");

            }else if(a<b) {
            for (; a < b; a++) {
                System.out.println(a);


            }

        }
    }


}


// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5











