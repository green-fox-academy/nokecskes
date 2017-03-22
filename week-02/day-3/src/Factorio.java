/**
 * Created by Connor on 2017.03.22..
 */

import java.util.Scanner;

public class Factorio {

    public static void main(String[] args) {
        //  Create the usual class wrapper and main method on your own.
        // - Create a function called `factorio` that returns it's input's factorial

        int inputParameter = getInput();

        int factorioNr = factorio(inputParameter);

        System.out.println(factorioNr);

    }


    public static int getInput(){

        /* ask the user for a non-negative integer, as, for now, I would avoid advanced mathematics. :)
        "The definition of the factorial function can also be extended to non-integer arguments, while retaining its most            important properties; this involves more advanced mathematics, notably techniques from mathematical analysis."
        (https://en.wikipedia.org/wiki/Factorial#Non-extendability_to_negative_integers)
        */

        int inputNumber = 0;

        do {
            System.out.println("Give me a non-negative number: ");
            Scanner scanner = new Scanner(System.in);
            inputNumber = scanner.nextInt();
        } while(inputNumber < 0);

        return inputNumber;
    }


    public static int factorio (int toFactor) {

        if (toFactor > 1){
            int factored = toFactor * factorio(toFactor - 1);
            return factored;
        }
        else {
            return 1;
        }

        /* The value of 0! is 1, according to the convention for an empty product.
            About empty product see: https://en.wikipedia.org/wiki/Empty_product
            So here: if the toFactor = 0 or 1, in both cases it'll return 1. (multiplying with zero would not be too nice               for the result of int factored)
         */
    }


}


