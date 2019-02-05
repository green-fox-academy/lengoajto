package GreenfoxInheritance;

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


}

//Create a Student class that has the same fields and methods as the Person class, and has the following additional
//
//fields:
//previousOrganization: the name of the student’s previous company / school
//skippedDays: the number of days skipped from the course
//methods:
//getGoal(): prints out "Be a junior software developer."
//introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
//skipDays(numberOfDays): increases skippedDays by numberOfDays
//The Student class has the following constructors:
//
//Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
//Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0