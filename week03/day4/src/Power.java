public class Power {

    public static void main(String[] args) {

        int base = 5;
        int power = 20;

        System.out.println(dieselPower(base,power));
    }
    public  static  int  dieselPower (int base, int power){

        int x = base;
        if (power != 2){
            x =   dieselPower(base, power -1);
        }
        x *= base;
        return x;
    }
}


// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).