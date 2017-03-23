import java.awt.SystemTray;
import java.util.Arrays;

/**
 * Created by Connor on 2017.03.23..
 */
public class Reverse {

  public static void main(String... args){

    // Create a function that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    reversed = reverse(reversed);

    System.out.println(reversed);

  }

  public static String reverse (String toReverse){

    int length = toReverse.length();
    String reversedBack = "";

    for (int i = 0; i < length; i++){
      char toLeft = toReverse.charAt(length - 1 - i);
      reversedBack += toLeft;
    }

    return reversedBack;
  }

}


/* Optional solution:
public static String reverse (String toReverse){


    char[] text = toReverse.toCharArray();
    int length = text.length;

    for (int i = 0; i < length/2; i++){
      char temp = text[i];
      text[i] = text[length - 1 - i];
      text[length - 1 - i] = temp;
    }

    toReverse = Arrays.toString(text);
    toReverse = toReverse.replace(", ", "");
    toReverse = toReverse.replace("[", "");
    toReverse = toReverse.replace("]", "");

    System.out.println(toReverse);

    return toReverse;
  }

 */




