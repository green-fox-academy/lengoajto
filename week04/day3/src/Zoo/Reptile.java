package Zoo;

import java.lang.*;

public class Reptile extends Animal {

    public Reptile(String name) {
        super(name, weight, );
    }


    @Override
    public String breed() {
        String breed = "laying eggs";
        return breed;
    }
}
