import java.util.Scanner;

/**
 * Created by Connor on 2017.04.17..
 */
public class DivideByZero {
  // create a function that takes a number
  // divides ten with it,
  // and prints the result.
  // it should print "fail" if the parameter is 0

  public static void main(String[] args) {
    int divider = askUserInput();
    divide(divider);
  }

  public static int askUserInput() {
    System.out.println("Please give me an integer: ");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    return input;
  }

  public static void divide(int divider) {
  try {
    int result = 10 / divider;
    System.out.println(result);
  }catch(ArithmeticException ex) {
    System.out.println("fail");
  }
  }
}
