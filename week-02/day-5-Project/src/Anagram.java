/**
 * Created by Connor on 2017.03.24..
 */
/*Create a function named is anagram.
 It should take two strings
 and return a boolean value depending on whether its an anagram or not.
 e.g.: "dog" and "god" = true, "green" and "fox" = false
 */

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

  public static void main(String[] args) {

    String inputFirst = askUserInput();
    String inputSecond = askUserInput();

    int lengthFirst = inputFirst.length();
    int lengthSecond = inputSecond.length();

    if (lengthFirst == lengthSecond){
      boolean checkIfAnagram = isAnagram(inputFirst, inputSecond);

      if(checkIfAnagram){
        trueMessage();
      }
      else{
        falseMessage();
      }
    }
    else{
      falseMessage();
    }

  }

  public static String askUserInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in a string: ");
    String inputString = scanner.next();
    return inputString;
  }

  public static void falseMessage() {
    System.out.println("false");
  }

  public static void trueMessage(){
    System.out.println("true");
  }

  public static boolean isAnagram(String toChechkFirst, String toCheckSecond) {

    String sortedFirst = sortInputString(toChechkFirst);
    String sortedSecond = sortInputString(toChechkFirst);

    boolean comparisonResult = sortedFirst.equals(sortedSecond);
    return comparisonResult;

  }

  public static String sortInputString(String inputStringToSort) {
    char[] inputToArray = inputStringToSort.toCharArray();
    Arrays.sort(inputToArray);
    String sortedArray = Arrays.toString(inputToArray);
    return sortedArray;
  }

}
