/**
 * Created by Connor on 2017.03.21..
 */

import java.util.Scanner;

public class PrintBigger {

    public static void main (String[] args){
        // Write a program that asks for two numbers and prints the bigger one

        System.out.println("Please give me two integers!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number one: ");
        int numberOne = scanner.nextInt();

        System.out.println("Number two: ");
        int numberTwo = scanner.nextInt();

        if(numberOne == numberTwo){
            System.out.println("They're equal!");
        }
        else if(numberOne > numberTwo){
            System.out.println(numberOne + " is bigger!");
        }
        else{
            System.out.println(numberTwo + " is bigger!");
        }
    }
}
