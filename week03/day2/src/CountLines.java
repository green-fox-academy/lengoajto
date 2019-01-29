import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        try {
            Path filepath = Paths.get("randomizedfile.txt");
            List<String> countLines = Files.readAllLines(filepath);
            System.out.println(countLines.size());
        }   catch (Exception ex) {
            System.err.println("Can not open the file");



        }
    }
}

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.