public class Bunnys {
    public static void main(String[] args) {

        int bunnie = 17888;

        System.out.println(FloppyEarCounter(bunnie));
    }

    public static int FloppyEarCounter (int bunnie) {
        int b = 0;
        if (bunnie>= 2){
            b = FloppyEarCounter(bunnie -1);
        }
        b += 2;
        return b;
    }
}

