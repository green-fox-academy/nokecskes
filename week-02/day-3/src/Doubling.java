/**
 * Created by Connor on 2017.03.22..
 */
public class Doubling {

    public static void main (String[] args){
    // - Create an integer variable named `ak` and assign the value `123` to it
    // - Create a function called `doubling` that doubles it's input parameter
    // - Print the result of `doubling(ak)`

        int ak = 123;

        int akDouble = doubling(ak);

        System.out.print(akDouble);
    }


    public static int doubling (int toDouble){
        toDouble *= 2;
        return toDouble;
    }

}


/*********************************************
 * or do the printing inside of doubling()
 *
 *  public static void doubling (int toDouble){
 *      toDouble *=2;
 *      Sy stem.out.println(toDouble);
 * }
 ********************************************/
