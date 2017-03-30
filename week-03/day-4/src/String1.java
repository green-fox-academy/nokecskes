import java.util.Scanner;

/**
 * Created by Connor on 2017.03.30..
 */
public class String1 {

  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    String toChange = getUserInput();

  }

  public static int getUserInput() {
    System.out.println("Give me a text with x characters: ");
    Scanner scanner = new Scanner(System.in);
    String inputString = scanner.nextLine();
    return inputString;
  }

}
