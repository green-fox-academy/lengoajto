package Animal;

public class AnimalTask {

    public static void main(String[] args) {

        Animal firstAnimal = new Animal();
        firstAnimal.eat ();
        firstAnimal.status ();

        Animal secondAnimal = new Animal();
        secondAnimal.eat ();
        secondAnimal.status();


    }

}








//Create an Animal class
//Every animal has a hunger value, which is a whole number
//Every animal has a thirst value, which is a whole number
//when creating a new animal object these values are created with the default 50 value
//Every animal can eat() which decreases their hunger by one
//  Every animal can drink() which decreases their thirst by one
//  Every animal can play() which increases both by one

