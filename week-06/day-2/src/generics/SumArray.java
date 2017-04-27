package generics;

import java.util.Arrays;

/**
 * Created by Connor on 2017.04.26..
 */
public class SumArray {

  public static void main(String[] args) {

    Integer[] intArray = {3, 4, 1, 2, 5};
    Double[] doubleArray = {4.5, 1.34, 1.3, 3.6, 3.654};
    int index = 3;

    Integer intArraySum = (int)sumArray(intArray, index);
    Double doubleArraySum = sumArray(doubleArray, index);
    System.out.printf("first three int sum is %d, double sum is %f", intArraySum, doubleArraySum);
  }

  public static <T extends Number> double sumArray(T[] arrayToSum, int index) {
    double sum = 0d;

    try {
      for (int i = 0; i < index ; i++) {
        sum += arrayToSum[i].doubleValue();
      }
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
     return sum;
  }
}
