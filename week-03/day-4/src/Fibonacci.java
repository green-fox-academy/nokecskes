import java.util.Scanner;

/**
 * Created by Connor on 2017.03.30..
 */
public class Fibonacci {

  public static void main(String[] args) {
    // The fibonacci sequence is a famous bit of mathematics, and it happens to
    // have a recursive definition. The first two values in the sequence are
    // 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the
    // previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21
    // and so on. Define a recursive fibonacci(n) method that returns the nth
    // fibonacci number, with n=0 representing the start of the sequence.

    int n = getUserInput();
    System.out.println(findFibonacci(n));
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

  public static int findFibonacci(int index) {
    if(index == 0) {
      return 0;
    }
    if(index == 1) {
      return 1;
    }
    int nthElement = findFibonacci(index - 1) + findFibonacci(index - 2);
    return nthElement;
  }

}
