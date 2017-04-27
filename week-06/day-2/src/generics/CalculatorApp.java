package generics;

/**
 * Created by Connor on 2017.04.27..
 */
public class CalculatorApp {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println(calculator.add());
    System.out.println(calculator.add(1));
    System.out.println(calculator.add(1, 5));
    System.out.println(calculator.add(1.4, 5.58));
    System.out.println(calculator.subtract());
    System.out.println(calculator.subtract(1));
    System.out.println(calculator.subtract(9, 6, 4, 4));
    System.out.println(calculator.subtract(5, 0.5));
    System.out.println(calculator.multiply());
    System.out.println(calculator.multiply(1));
    System.out.println(calculator.multiply(2, 0.5));
    System.out.println(calculator.multiply(2, 0));
    System.out.println(calculator.divide());
    System.out.println(calculator.divide(1));
    System.out.println(calculator.divide(5, 2));
    System.out.println(calculator.divide(3.3, 1.1));
    System.out.println(calculator.divide(3.3, -1.1));
    System.out.println(calculator.divide(3.3, 0));


  }

}
