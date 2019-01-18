import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many chickens and pigs do you have? Enter two numbers!");
        int a=input.nextInt();
        int b=input.nextInt();
        int s=(a*2)+(b*4);
        System.out.println("All of your animals has " + s + " legs together.");

        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}