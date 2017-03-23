/**
 * Created by Connor on 2017.03.23..
 */

import com.sun.org.apache.xpath.internal.operations.Div;
import java.util.HashMap;
import java.util.Scanner;

public class Calculator {

  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations:
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit

    Scanner scanner = new Scanner(System.in);

    String operation = "";
    do{
      System.out.println("Please type in the expression:" );
      operation = scanner.next();
    }while(!(operation.equalsIgnoreCase("+") || operation.equalsIgnoreCase("-") || operation.equalsIgnoreCase("*") || operation.equalsIgnoreCase("/") || operation.equalsIgnoreCase("%")));

    int[] operand = {scanner.nextInt(), scanner.nextInt()};

    int resultOfOperation= doTheOperation(operation, operand);
    System.out.print(resultOfOperation);

  }

  public static int doTheOperation(String mathSymbol, int[] inputNumbers){

    int resultNumber = 0;

    if (mathSymbol.equalsIgnoreCase("+")) {
      resultNumber = add(inputNumbers);
    }
    else if (mathSymbol.equalsIgnoreCase("-")) {
      resultNumber = substract(inputNumbers);
    }
    else if (mathSymbol.equalsIgnoreCase("*")) {
      resultNumber = multiply(inputNumbers);
    }
    else if (mathSymbol.equalsIgnoreCase("/")) {
      resultNumber = divide(inputNumbers);
    }
    else if (mathSymbol.equalsIgnoreCase("%")) {
      resultNumber = modulo(inputNumbers);
    }

    return resultNumber;
  }

  public static int add (int[] toAdd){
    int added = toAdd[0] + toAdd[1];
    return added;
  }

  public static int substract (int[] toSubstract){
    int substracted = toSubstract[0] - toSubstract[1];
    return substracted;
  }

  public static int multiply (int[] toMultiply){
    int multiplied = toMultiply[0] * toMultiply[1];
    return multiplied;
  }

  public static int divide (int[] toDivide){
    int Divided = toDivide[0] / toDivide[1];
    return Divided;
  }

  public static int modulo (int[] toModulo){
    int rest = toModulo[0] % toModulo[1];
    return rest;
  }

}
