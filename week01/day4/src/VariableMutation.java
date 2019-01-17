public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a = a + 20;
        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b = b - 94;
        System.out.println(b);

        int c = 44;

        // please double c's value
        c = c*2;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d= d/5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e = e * e * e;
        System.out.println(e);

        // tell if f1 is bigger than f2 (print as a boolean)
        int f1 = 123;
        int f2 = 345;
        boolean test = (f1 > f2);
        System.out.println(test);


        // tell if the double of g2 is bigger than g1 (print as a boolean)
        int g1 = 350;
        int g2 = 200;
        boolean test2 = (g1 < g2);
        System.out.println(test2);


        // tell if it has 11 as a divisor (print as a boolean)
        int h = 135798745;

        int i1 = 10;
        int i2 = 3;

        int test3 = h & 11;
        boolean test4 = test3 == 1;
        System.out.println(test4);


        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        boolean i;
        if(i1>(i2*i2)&&i1>(i2*i2*2)){
            i=true;
        }else{
            i=false;
        }
        System.out.println(i);


        //fill the k variable with its content 4 times
        String k = "Apple";
        k = "Apple" + "Apple" + "Apple" + "Apple";
        System.out.println(k);
    }
}