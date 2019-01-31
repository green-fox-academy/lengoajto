public class SumDigit {
    public static void main(String[] args) {
        int result = digitCounter(2345);
        System.out.println(result);
    }

    public static int digitCounter(int n) {
        if (n < 1) {
            return 0;
        }
        return (n % 10 + digitCounter(n / 10));
    }
}


// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).