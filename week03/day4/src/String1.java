public class String1 {
    public static void main(String[] args) {
        String words = "xaaaaaaaxxxxxxxxxx";
        char from = 'x';
        char to = 'y';

        System.out.println(replace(words, from, to));
    }

    public static String replace(String s, char from, char to) {
        if (s.length() < 1) {
            return s;
        } else {
            char first = from == s.charAt(0) ? to : s.charAt(0);
            return first + replace(s.substring(1), from, to);
        }

    }
}