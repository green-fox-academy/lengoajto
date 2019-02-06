package Cloneable;

public class Student extends Person {

    String previousOrganization;
    int skippeddays;

    public Student () {

        super();
        previousOrganization = "The School of Life";
        skippeddays = 0;
    }

    public Student (String name, int age, String gender, String previous) {
        super(name, age, gender);
        skippeddays = 0;
        this.previousOrganization = previous;

    }
    @Override
    public void getGoal () {
        System.out.println("Be a junior software developer.");
    }
    @Override
    public void introduce () {
        System.out.println("Hi, I'm " + name +", a " + age + " age year old " + gender + " from " + previousOrganization +" who skipped " + skippeddays + " days from the course already ");


    }
    public void skipDays(int numbersOf) {
        this.skippeddays += numbersOf;

    }

    @Override
    public Student clone () { //uj objektum, ami uolyan mint az eredeti, studentkent klonozzuk, de mas parameterekkel, aztan returnoljuk Studentkent.
        return new Student(name, age, gender, previousOrganization);

    }


}