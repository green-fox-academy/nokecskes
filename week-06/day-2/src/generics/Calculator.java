package generics;

/**
 * Created by Connor on 2017.04.27..
 */
public class Calculator {

  public <T extends Number> double add(T... numbers) {
    if (isInputValid(numbers)) {
      double result = 0;
      for (T number : numbers) {
        result += number.doubleValue();
      }
      return result;
    }
    return 0;
  }

  public <T extends Number> double subtract(T... numbers) {
    if (isInputValid(numbers)) {
      double result = numbers[0].doubleValue();
      for (int i = 0; i < numbers.length - 1; i++) {
        result -= numbers[i + 1].doubleValue();
      }
      return result;
    }
    return 0;
  }

  public <T extends Number> double multiply(T... numbers) {
    if (isInputValid(numbers) && !hasAZeroElement(numbers)) {
      double result = 1;
      for (T number : numbers) {
        result *= number.doubleValue();
      }
      return result;
    }
    return 0;
  }


  public <T extends Number> double divide(T... numbers) {
    if (isInputValid(numbers) && !hasAZeroElement(numbers)) {
      double result = numbers[0].doubleValue();
      for (int i = 0; i < numbers.length - 1 ; i++) {
        result /= numbers[i + 1].doubleValue();
      }
      return result;
    }
    return 0;
  }

  public <T extends Number> boolean isInputValid(T... numbers) {
    if (numbers.length == 0 || numbers.length == 1) {
      System.out.println("Not enough input to do the operation!");
      return false;
    }
    return true;
  }

  public <T extends Number> boolean hasAZeroElement (T... numbers) {
    for (T number : numbers) {
      if (number.doubleValue() == 0) {
        System.out.println("Can't do the operation with zero!");
        return true;
      }
    }
    return false;
  }




}
