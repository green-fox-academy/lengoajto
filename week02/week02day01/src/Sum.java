//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer


public class Sum {
    public static void main(String[] args){


        int [] Numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100};
            int function = sum(Numbers);
        System.out.println(function);
        }

     public static int sum (int[]sumsum) {

        int result = 0;

        for (int i = 0; i < sumsum.length; i++) {

             result += sumsum[i];

        }

        return result;

    }

}
