/**
 * Created by Connor on 2017.03.22..
 */

import jdk.internal.util.xml.impl.Input;

import java.awt.*;
import java.util.Scanner;

public class Sum {

    public static void main (String[] args){

        //  Create the usual class wrapper and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter

        int inputParameter = getInput();

        int summedPar = sum(inputParameter);

        System.out.println(summedPar);
    }


    public static int getInput(){

        System.out.println("Give me a number: ");

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        return inputNumber;
    }


    public static int sum (int toSum) {

        if (toSum > 0){
            int summed = toSum + sum(toSum-1);
            return summed;
        }
        else{
            return 0;
        }

    }
}

/*
first version: for loops second parameter was i < toSum
thought to be the problem: that the variable "summed" saves its value outside the loop, and even if I increment it in the loop, it will return back to its value initialized outside of the loop
real problem: (as Kond pointed out) is much simpler iterated not to toSum but toSum-1

second version: change it to i < (toSum +1), see at the bottom

third: see above, my first ever recursive function! Yaaaay! :))

public static int sum (int toSum){
    int summed = 0;

    for (int i = 0; i < (toSum + 1); i++){
        summed = summed + i;
    }

    return summed;
}

 */
