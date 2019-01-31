// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class Bunny2 {

    public static void main(String[] args) {
        int bunnnies = 0;

        System.out.println(countEarsOfBunnies(2));
    }

    public static int countEarsOfBunnies(int numberOfBunnies) {
        int earsOfOdd = 2;
        int earsOfEven = 3;
        int numberOfEars = 0;
        if (numberOfBunnies > 0) {
            if (numberOfBunnies % 2 == 1){
                numberOfEars = earsOfOdd + countEarsOfBunnies(numberOfBunnies-1);
            } else {
                numberOfEars = earsOfEven + countEarsOfBunnies(numberOfBunnies-1);
            }

        }
        return numberOfEars;
    }


}