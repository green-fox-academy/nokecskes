package multiples;

import java.util.Scanner;

/*
Multiples of 3 and 5
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Multiples {

  public static void main(String[] args) {
    int numbersBelow = askUserInput();
    int sum = sumOfMultiplesOF3And5(numbersBelow);
    System.out.println(sum);
  }

  public static int sumOfMultiplesOF3And5(int numbersBelow) {
    int[] arrayOfNaturalNumbers = fillArray(numbersBelow);
    int sum = 0;
    for (int i = 0; i < arrayOfNaturalNumbers.length; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static int askUserInput() {
    int input;
    do {
      System.out.println("Please give me a positive number!");
      Scanner scanner = new Scanner(System.in);
      input = scanner.nextInt();
    } while (input < 1);
    return input;
  }

  public static int[] fillArray(int smallerThan) {
    int[] arrayOfNaturalNumbers = new int[smallerThan];
    for (int i = 0; i < smallerThan; i++) {
      arrayOfNaturalNumbers[i] = i;
    }
    return arrayOfNaturalNumbers;
  }

}
