import java.util.Scanner;

/**
 * Created by Connor on 2017.03.30..
 */
public class Power {

  public static void main(String[] args) {
    // Given base and n that are both 1 or more, compute recursively (no loops)
    // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    int base = getUserInput();
    int toPowerOf = getUserInput();
  }

  public static int getUserInput() {
    Scanner scanner = new Scanner(System.in);
    int inputInt = 0;
    do {
      System.out.println("Give me a non negative number: ");
      inputInt = scanner.nextInt();
    }while(inputInt < 1);
    return inputInt;
  }

  


}
