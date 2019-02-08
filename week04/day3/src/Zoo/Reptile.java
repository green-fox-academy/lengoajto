package Zoo;

import java.lang.*;

public class Reptile extends Animal {

    public Reptile(String name, int age, double weight, String gender, double height) {
        super(name, age, weight, gender, height);
    }


    @Override
    public String breed() {
        String breed = "laying eggs";
        return breed;
    }
}
