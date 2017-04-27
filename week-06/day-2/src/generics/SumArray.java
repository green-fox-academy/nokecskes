package generics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Connor on 2017.04.26..
 */
public class SumArray {

  public static void main(String[] args) {

    Integer[] intArray = {3, 4, 1, 2, 5};
    Double[] doubleArray = {4.5, 1.34, 1.3, 3.6, 3.654};
    int index = getInputIndex();

    Integer intArraySum = (int)sumArray(intArray, index);
    Double doubleArraySum = sumArray(doubleArray, index);
    System.out.printf("int sum is %d, double sum is %f", intArraySum, doubleArraySum);
  }

  public static int getInputIndex () {
    int index = 0;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("How many elements of array do you want to add?");
      index = scanner.nextInt();
    } while (index < 0);
    return index;
  }

  public static <T extends Number> double sumArray(T[] arrayToSum, int index) {
    double sum = 0d;

    try {
      for (int i = 0; i < index ; i++) {
        sum += arrayToSum[i].doubleValue();
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Index out of bound!");
      return 0;
    }
     return sum;
  }
}
