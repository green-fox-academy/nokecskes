/**
 * Created by Connor on 2017.03.21..
 */
public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double sideA = 5.5;
        double sideB = 2.3;
        double sideC = 6.8;

        double surface = 2 * ((sideA*sideB) + (sideB*sideC) + (sideC*sideA));
        double volume = sideA * sideB * sideC;

        System.out.println("Surface area: " + surface + "\nVolume: " + volume);




    }
}
