/**
 * Created by Connor on 2017.03.21..
 */
public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13
        int a = 22;
        int b = 13;

        // Print the result of 13 added to 22
        System.out.println("13 + 22 = " + (b + a));

        // Print the result of 13 substracted from 22
        System.out.println("22 - 13 = " + (a - b));

        // Print the result of 22 mutiplied by 13
        System.out.println("22 * 13 = " + (a * b));

        // Print the result of 22 divided by 13 (as a decimal fraction)
        System.out.println("22 / 13 = " + ((float)a / (float)b));

        // Print the integer part of 22 divided by 13
        System.out.println("The integer part of 22 / 13 = " + (a / b) );

        // Print the reminder of 22 divided by 13
        System.out.println("The remainder of 22 / 13 = " + (a % b));

    }


}
