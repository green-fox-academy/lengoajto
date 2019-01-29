import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        content.add("Báthory Róbert");

        try {
            Path filePath = Paths.get("my-file.txt");
            Files.write(filePath, content);
            System.out.println(Files.isWritable(filePath));

        } catch (Exception ex) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}



// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"
