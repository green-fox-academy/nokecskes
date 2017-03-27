/**
 * Created by Connor on 2017.03.25..
 */

import java.util.Scanner;

public class ParametricAverage {

  public static void main(String[] args) {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    int numberOfNumbers = askUserNrOfInputs();

    int sum = 0;
    double avarage = 0;

    for (int i = 0; i < numberOfNumbers ; i++) {
      int currentNumber = askUserNumberInput(i + 1);
      sum += currentNumber;
    }

    avarage = (double)sum / (double)numberOfNumbers;

    System.out.println("Sum: " + sum +"\nAvarage: " + avarage);

  }

  public static int askUserNrOfInputs(){
    System.out.println("How many numbers do you want to play with?");
    Scanner scanner= new Scanner(System.in);
    int userInput = scanner.nextInt();
    return userInput;
  }

  public static int askUserNumberInput(int currentInputIndex){
    System.out.println("Please give me the number: ");
    Scanner scanner = new Scanner(System.in);
    int currentInput = scanner.nextInt();
    return currentInput;
  }

}
