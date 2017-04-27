package generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Connor on 2017.04.26..
 */
public class SortArray {

  public static void main(String[] args) {

    Integer[] intArray = {3, 4, 1, 2, 5};
    Double[] doubleArray = {4.5, 1.34, 1.3, 3.6, 3.654};

    Integer[] sortedIntArray = sortArray(intArray, intArray.length);
    Double[] sortedDoubleArray = sortArray(doubleArray, doubleArray.length);
    System.out.println(Arrays.toString(sortedIntArray));
    System.out.println(Arrays.toString(sortedDoubleArray));
  }

  public static <T extends Number> T[] sortArray(T[] arrayToSort, int length) {
    Arrays.sort(arrayToSort);
    for (int i = 0; i < arrayToSort.length / 2; i++) {
      T temp = arrayToSort[i];
      arrayToSort[i] = arrayToSort[arrayToSort.length - 1 - i];
      arrayToSort[arrayToSort.length - 1 - i] = temp;
    }
    return arrayToSort;
  }

}

/*

        This method takes an array in parameter, and sort it in a descending order
        Pro tip: Temporary values/arrays help a lot
        Whether or not you had an exception print out the elements of the array*/
