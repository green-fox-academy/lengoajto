// - Create a function called `factorio`
//   that returns it's input's factorial


import java.util.Scanner;

public class Factorio {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        int fact = factorio(inputNumber);
        System.out.println(fact);

        //int fact2 = factorio(7);
    }

    public static int factorio (int a) {

        //for(/*kezdőérték*/;/*belépési feltétel*/;/*léptetés*/) {
        // utasítások
        //}

        // 1 + 1 + 2 + 3 + 4 + 5 = 16
        // 1 * 2 *3 *4 * 5 = 120

        int result = 1;
        // Amikor teljesül a belépési feltétel, akkor újra végrehajtjuk a ciklusmag utasításait és "újrapróbálkozik"
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }

        return result;
    }
}
