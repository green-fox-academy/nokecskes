/**
 * Created by Connor on 2017.03.21..
 */

import java.util.Scanner;

public class PartyIndicator {

    public static void main (String[] args ){

        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me the number of girls: ");
        int girls = scanner.nextInt();

        System.out.println("Please give me the number of boys: ");
        int boys = scanner.nextInt();

        int attend = girls + boys;

        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

        if (girls != 0){
            if(boys == girls && attend > 20 ){
                System.out.println("The party is excellent!");
            }
            else if (boys != girls && attend > 20){
                System.out.println("Quite cool party!");
            }
            else if (attend < 20){
                System.out.println("Average party...");
            }
        }
        else {
            System.out.println("Sausage party");
        }
    }
}
