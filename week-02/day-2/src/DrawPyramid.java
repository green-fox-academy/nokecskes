/**
 * Created by Connor on 2017.03.22..
 */

import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was

        int height = inputNr();
        String space = " ";
        String asterisk = "*";

        for (int i = 0; i < height; i++){
            int noSymbol = (height - 1 - i);
            int symbol = 2 * i + 1;

            for (int j = 0; j < noSymbol; j++){
                System.out.print(space);
            }

            for (int k = 0; k < symbol; k++ ){
                System.out.print(asterisk);
            }

            System.out.print("\n");

        }

    }


    public static int inputNr (){

        Scanner scanner = new Scanner(System.in);
        int userGivenNr = 0;

        do{
            System.out.print("Please give me a positive number: ");
            userGivenNr = scanner.nextInt();
        } while (userGivenNr < 1);

        return userGivenNr;

    }

}
