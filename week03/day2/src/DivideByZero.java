import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        try {
            int finalresult = GivenNumber(number);
            System.out.println(finalresult);
        } catch (ArithmeticException ex) {
            System.out.println("Fail");
        }
    } public static int GivenNumber(int number) {
        int result = 10 / number;
        return result;
    }
}





// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0