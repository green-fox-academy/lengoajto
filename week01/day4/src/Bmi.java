public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        double bodyMassIndex = massInKg/(heightInM * heightInM);

        System.out.println(bodyMassIndex);
        // Print the Body mass index (BMI) based on these values
    }
}