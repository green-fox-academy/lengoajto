import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class MultipleLines {
    public static void main(String[] args) {
        writelines("tokmindegy.txt", "green", 6);
    }

    public static void writelines(String fileName, String word, int numberOfLines) {
        Path filePath = Paths.get(fileName);
        List<String>writeTheWords = new ArrayList<>();
        for (int i = 0; i < numberOfLines; i++) {
            writeTheWords.add(word);
            
        }

        try {
            Files.write(filePath, writeTheWords);

        }
        catch (Exception ex) {
            System.out.println();

        }
    }
}

// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.