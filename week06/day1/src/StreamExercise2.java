import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> squaredNumbers = numbers.stream().filter(s -> s > 0).map(s -> s * s).collect(Collectors.toList());
        System.out.println(squaredNumbers.toString());
    }
}
//filterrel megszuri a pozitiv szamokat, aztan beadja a mapbe, negyzetre emeli, listet var vissza. punktum



//Write a Stream Expression to get the squared value of the positive numbers from the following list:
//List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);