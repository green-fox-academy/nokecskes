/**
 * Created by Connor on 2017.03.21..
 */

import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        System.out.println("Please give me five integers!");

        Scanner scanner = new Scanner (System.in);

        System.out.println("Number 01: ");
        int a = scanner.nextInt();
        System.out.println("Number 02: ");
        int b = scanner.nextInt();
        System.out.println("Number 03: ");
        int c = scanner.nextInt();
        System.out.println("Number 04: ");
        int d = scanner.nextInt();
        System.out.println("Number 05: ");
        int e = scanner.nextInt();

        int sum = a + b + c + d + e;
        double avarage = (double)sum / 5.01;

        System.out.println("The sum is: " + sum + "\nThe avarage is: " + avarage );
    }




}
