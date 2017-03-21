/**
 * Created by Connor on 2017.03.21..
 */

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Than prints "Odd" if the number is odd, or "Even" it it is even.

        System.out.println("Please give me a number!");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Even!");
        }
        else {
            System.out.println("Odd!");
        }

    }

}
