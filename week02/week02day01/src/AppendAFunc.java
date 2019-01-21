//  Create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendAFunc` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
//
// - Print the result of `appendAFunc(typo)`


public class AppendAFunc {
    public static void main(String[] args) {
        String typo = "Chinchill";
        String correctWord = appendAFunc(typo);

        System.out.println(correctWord);
    }

     public static String appendAFunc (String word) {
        String mindegymi = word + "a";
        return mindegymi;
     }

}

