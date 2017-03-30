import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Connor on 2017.03.30..
 */
public class String3 {

  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".

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
    if (toChange.length() > 1) {
      toChange = toChange.charAt(0) + "*" + changeString(toChange.substring(1));
    }
    return toChange;
  }
}
