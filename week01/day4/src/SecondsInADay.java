public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int fullday=24*3600;
        int day=14*3600;
        int minutes=34*60;


        int result =fullday-(day+currentSeconds+minutes);
        System.out.println(result+" sec");
    }
}