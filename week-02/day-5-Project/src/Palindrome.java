/**
 * Created by Connor on 2017.03.24..
 */

/*Create a function named create palindrome
It should take a string, create a palindrome from it and then return it.
e.g.: "greenfox" to "greenfoxxofneerg", "123" to "123321"
 */

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome{

  public static void main(String[] args) {

    String toPalindrome = askUserInput();

    String palindromedString = createPalindrome(toPalindrome);

    System.out.println(palindromedString);

  }

  public static String askUserInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in a string: ");
    String inputString = scanner.next();
    return inputString;
  }

  public static String createPalindrome(String userInput) {
    String wordBackwards = spellBackwards(userInput);
    userInput = userInput.concat(wordBackwards);
    return userInput;
  }

  public static String spellBackwards(String toSpellBackwards){

    char[] toSpellAsArray = toSpellBackwards.toCharArray();
    int length = toSpellAsArray.length;

    for (int i = 0; i < (length / 2); i++) {
      char temp = toSpellAsArray[i];
      toSpellAsArray[i] = toSpellAsArray[length - 1 - i];
      toSpellAsArray[length - 1 - i] = temp;
    }

    toSpellBackwards = Arrays.toString(toSpellAsArray);

    toSpellBackwards = deleteChar(toSpellBackwards, ", ");
    toSpellBackwards = deleteChar(toSpellBackwards, "[");
    toSpellBackwards = deleteChar(toSpellBackwards, "]");

    return toSpellBackwards;
  }

  public static String deleteChar(String deleteFrom, String toDelete){
    deleteFrom = deleteFrom.replace(toDelete, "");
    return deleteFrom;
  }

}
