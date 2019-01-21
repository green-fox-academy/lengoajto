public class CodingHours {
    public static void main(String[] args) {

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long

        int averageCodingHours = 6*5*17;
        System.out.println(averageCodingHours);
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //

        float average = 52;
        float all = 17*7*24;
        float percentage = (52*17)/all*100;
        System.out.println(percentage +"%");

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
    }
}

