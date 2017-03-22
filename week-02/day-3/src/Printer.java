/**
 * Created by Connor on 2017.03.22..
 */
public class Printer {

    public static void main(String[] args) {

        //  Create the usual class wrapper and main method on your own.
        // - Create a function called `printer`which prints the input String parameters
        //   (can have multiple number of arguments)

        String text01 = "strawberry";
        String text02 = "apple";
        String text03 = "orange";
        String text04 = "cherry";
        String text05 = "kiwi";

        printer(text01, text02, text04, text05);
        printer(text02, text05);

    }

    public static void printer (String... toPrint){
        for(String currentString : toPrint){
            System.out.println(currentString);
        }

        /* the simple for loop
        for (int i = 0; i < toPrint.length; i++){
            System.out.println(toPrint[i]);
            }
        */

    }

}


/*
* first idea:
* 1. in the main function:
* String[] toPrint = {...always type here the Strings to print...};
* printer(toPrint);
*
* 2. printer function:
* public static void printer (String[] inputArray){
*   ... print it with a for loop ....
* }
*
*/
