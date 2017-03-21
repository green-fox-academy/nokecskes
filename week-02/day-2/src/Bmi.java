/**
 * Created by Connor on 2017.03.21..
 */
public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        double bmi = massInKg / Math.pow(heightInM, 2);
        bmi = Math.floor(bmi*100) / 100;
        System.out.println(bmi);
    }
}
