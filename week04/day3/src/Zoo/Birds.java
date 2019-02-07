package Zoo;

import java.lang.*;

public class Birds extends Animal{
    public Birds(String name) {
        super(name, age, weight, gender, height);
    }

    public Birds(String parrot, double weight, String gender, double height) {
        super(name, weight, gender, height );

    }

    @Override
    public String breed() {
        String breed = "laying eggs";
        return breed;
    }
    @Override
    public void landing () {

    }

    @Override
    public void flying() {

    }

    @Override
    public void takeOff () {

    }
}
