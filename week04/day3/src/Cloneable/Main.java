package Cloneable;



public class Main {
    public static void main(String[] args) {


    Student john = new Student("John", 20, "male", "BME" );

    Student johnClone = john.clone();

    johnClone.introduce();

    }


}
//Letrehozzuk az uj klont uj objektumkent a megadott parameterekkel a mainben studentkent. majd a vegen introduceoljuk.
//