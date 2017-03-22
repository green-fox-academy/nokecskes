/**
 * Created by Connor on 2017.03.21..
 */

import java.util.Scanner;

public class DrawTriangle {

    public static void main (String[] args){

        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        String asterisk = "*";

        System.out.println("Please give me an integer: ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for (int i = 0; i < (height + 1); i++){
            for (int k = 0; k < i ; k++){
                    System.out.print(asterisk);
                }
            System.out.print("\n");
        }

    }

}
