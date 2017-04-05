package fibonacci;

/**
 * Created by Connor on 2017.04.05..
 */
public class Fibonacci {

  public int fibonaccoiNthElement(int element) {
    if (element < 1) {
      return 0;
    }

    if(element == 1) {
      return 1;
    } else if(element == 2) {
      return 1;
    }
    int nthElementValue = fibonaccoiNthElement(element - 1) + fibonaccoiNthElement(element - 2);
    return nthElementValue;
  }
}
