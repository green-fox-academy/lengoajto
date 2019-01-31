import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        finalcountdown(n);
    }

    static void finalcountdown(int n) {
        if(n >= 0) {
            System.out.println(n);
            finalcountdown(n-1);
        }

    }

}

// Write a recursive function that takes one parameter: n and counts down from n.

