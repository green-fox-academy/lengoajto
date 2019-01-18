import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = in.nextLine();
        System.out.println("Hello " +name + " Hello World!");

        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        //System.out.println("Hello, World!");
    }
}