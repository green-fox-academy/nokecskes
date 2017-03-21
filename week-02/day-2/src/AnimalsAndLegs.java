/**
 * Created by Connor on 2017.03.21..
 */

import java.util.Scanner;
public class AnimalsAndLegs {

    public static void main(String[] args) {
        // Write a program that asks for two integers
        System.out.println("Please give me the number of chickens and the number of pigs on the farm, and I'll do magic. :)");

        Scanner scanner = new Scanner(System.in);
        // The first represents the number of chickens the farmer has
        int chicks = scanner.nextInt();
        int chicksLegs = chicks * 2;

        // The second represents the number of pigs the farmer has
        int pigs = scanner.nextInt();
        int pigsLegs = pigs * 4;

        int legsTotal = chicksLegs + pigsLegs;

        // It should print how many legs all the animals have
        System.out.println("And the magic is, that alltogether they have " + legsTotal + " legs in the leg-party! Yaay!");
    }

}
