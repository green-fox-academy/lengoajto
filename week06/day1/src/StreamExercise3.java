import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise3 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> whichSquaredNumberAreBiggerThan20 = numbers.stream().map(s -> s * s).filter(s -> s > 20).collect(Collectors.toList());
        System.out.println(whichSquaredNumberAreBiggerThan20.toString());
    }

}



//Exercise 3
//Write a Stream Expression to find which number squared value is more then 20 from the following list:
//
//List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);