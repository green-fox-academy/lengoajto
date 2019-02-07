package Zoo;

import java.lang.*;

import Zoo.Birds;
import Zoo.Mammal;
import Zoo.Reptile;

public class Zoooo {

    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile", 150.2, "female", 0.50);
        Mammal mammal = new Mammal("Koala",10, "male", 60.5);
        Birds bird = new Birds("Parrot", 1.5, "male", 1.5);

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
    }
}