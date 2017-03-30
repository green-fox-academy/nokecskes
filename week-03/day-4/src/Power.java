import java.util.Scanner;

/**
 * Created by Connor on 2017.03.30..
 */
public class Power {

  public static void main(String[] args) {
    // Given base and n that are both 1 or more, compute recursively (no loops)
    // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    System.out.println("Give me the base: ");
    int base = getUserInput();
    System.out.println("Give me the power (so I can rule the world :) ): ");
    int toPowerOf = getUserInput();

    System.out.println(power(base, toPowerOf));
  }

  public static int getUserInput() {
    Scanner scanner = new Scanner(System.in);
    int inputInt = 0;
    do {
      inputInt = scanner.nextInt();
    }while(inputInt < 1);
    return inputInt;
  }

  public static int power (int base, int n) {
    if(n < 1) {
      return 1;
    }
    else {
      n--;
      int multiply = base * power(base, n);
      return multiply;
    }
  }




}
