import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Connor on 2017.03.30..
 */
public class String1_better {

  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    String input = getUserInput();
    String changed = changeString(input);
    System.out.println(changed);
  }

  public static String getUserInput() {
    System.out.println("Give me a text with x characters: ");
    Scanner scanner = new Scanner(System.in);
    String inputString = scanner.nextLine();
    return inputString;
  }

  public static String changeString(String toChange) {
    if (toChange.length() == 0) {
      return "";
    }
    if(toChange.charAt(0) == 'x') {
      toChange = 'y' + toChange.substring(1);
    }
    toChange = toChange.charAt(0) + changeString(toChange.substring(1));
    return toChange;
  }

}
