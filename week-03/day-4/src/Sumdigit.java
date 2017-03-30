import java.util.Scanner;

/**
 * Created by Connor on 2017.03.30..
 */
public class Sumdigit {

  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    int digitsToAdd = getUserInput();
  }

  public static int getUserInput() {
    Scanner scanner = new Scanner(System.in);
    int inputInt = 0;
    do {
      System.out.println("Give me a non negative number: ");
      inputInt = scanner.nextInt();
    }while(inputInt < 0);
    return inputInt;
  }
}
