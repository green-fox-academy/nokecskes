/**
 * Created by Connor on 2017.03.21..
 */
import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        System.out.println("Give me the distance in kilometers!");

        Scanner scanner = new Scanner (System.in);
        int distanceKM = scanner.nextInt();

        // then it converts that value to miles and prints it
        double distanceM = (double)distanceKM * 0.62;
        System.out.println(distanceKM + "km equals " + distanceM + " 1miles.");


    }

}
