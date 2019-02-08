package Zoo;

import java.lang.*;

public class Mammal extends Animal{
    public Mammal(String name, int age, double weight, String gender, double height) {
        super ( name, age, weight, gender, height);
    }

    @Override
    public String breed() {
        String breed = "pushing miniature versions out.";

        return breed;
    }



}
