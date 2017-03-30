import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Connor on 2017.03.30..
 */
public class String1 {

  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    String input = getUserInput();
    char[] toChangeArray = input.toCharArray();
    char[] changedArray = changeString(toChangeArray,0);

    String changed = Arrays.toString(changedArray);
    changed = fixArrayForm(changed);
    System.out.println(changed);
  }

  public static String getUserInput() {
    System.out.println("Give me a text with x characters: ");
    Scanner scanner = new Scanner(System.in);
    String inputString = scanner.nextLine();
    return inputString;
  }

  public static char[] changeString(char[] toChange, int index) {
    if (index == (toChange.length - 1)) {
      if(toChange[index] == 'x'){
        toChange[index] = 'y';
      }
    }
    else {
      if(toChange[index] == 'x'){
        toChange[index] = 'y';
      }
      changeString(toChange, index + 1);
    }
    return toChange;
  }

  public static String fixArrayForm(String toFix) {
    toFix = toFix.replace("[","");
    toFix = toFix.replace("]","");
    toFix = toFix.replace(", ","");
    return toFix;
  }

}