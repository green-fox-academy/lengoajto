package Animal;

public class Animal {
    int hunger;
    int thirst;

    public Animal() {
        hunger = 10;
        thirst = 20;

    }

    public void eat() {
        hunger -= -1;
        thirst -= -1;
    }

    public void drink() {
        thirst -= -1;

    }

    public void play() {
        hunger += +1;
        thirst += +1;

    }
    public void status() {
        System.out.println("My hunger is:" + hunger + " and my thirst is: " + thirst + "points.");
    }

}


//Create an Animal class
//Every animal has a hunger value, which is a whole number
//Every animal has a thirst value, which is a whole number
//when creating a new animal object these values are created with the default 50 value
//Every animal can eat() which decreases their hunger by one
//  Every animal can drink() which decreases their thirst by one
//  Every animal can play() which increases both by one
