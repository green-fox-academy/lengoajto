import java.util.Scanner;

public class NumberAdder {
    public static void main(String[] args) {

        int n = 10;

        System.out.println(numberAdder(n));
    }
    static int numberAdder( int n) {
        if(n >= 1) {
            return n + numberAdder(n-1);
            } return 0;
    }




}


// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.