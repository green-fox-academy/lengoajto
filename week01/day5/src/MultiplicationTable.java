import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timesTable, counter, total;
        System.out.println("What multiplication table would u like to view?");
        timesTable =scanner.nextInt();
        System.out.println("To what value would you like to display to?");
        counter = scanner.nextInt();
        for (int i = 0; i <= counter; i++) {
            total = timesTable * i;
            System.out.println(timesTable + " x " + i + " = " + total);

        }


        }
    }



// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150