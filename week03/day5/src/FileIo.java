import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FileIo {
    public static void main(String[] args) {

        try {
            Path file = Paths.get("C:\\Users\\user\\greenfox\\lengoajto\\week03\\day5\\src\\valami.txt");
        System.out.println(Files.readAllLines(file).size());
        ArrayList<String> nevek = (ArrayList<String>) Files.lines(file).map(line -> line.split(";")[0]).collect(Collectors.toList()); //
        ArrayList<String> szamok = new ArrayList<>();
        szamok.add(new Integer(3).toString());
        //kigyujti a valami.txt-bol a neveket. Splittel kiszedi a ;-t, stringge alakitjuk, majd foreachchel vegigmegyunk a tombon.
            Files.write(file, nevek, StandardOpenOption.APPEND);
            Files.write(file, szamok, StandardOpenOption.APPEND);
            for (String nev: nevek) {
                System.out.println(nev);
            }
        } catch (Exception e) {

        }
    }

}
