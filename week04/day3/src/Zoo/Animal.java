package Zoo;

import java.lang.*;


public abstract class Animal {

    String name;
    int age;
    double weight;
    String gender;
    double height;

    public Animal(String name, int age, double weight, String gender, double height){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;


    }

    public String getName() {
        return name;
    }

    public abstract String breed ();


}
