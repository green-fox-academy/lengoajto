import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int zero = n;
        int stars = 1;

        for (int i = 0; i <n; i++) {
            System.out.print(" ");
        }
            for (int j = 0; j < stars; j++) {
                System.out.println("*");

            }
            zero--;
            stars = stars+2;
                System.out.println();
    }

}



