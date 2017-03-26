/**
 * Created by Connor on 2017.03.26..
 */

import java.util.Scanner;

/**
 * Write a program where the program chooses a number between 1 and 100.
 * The player is then asked to enter a guess.
 * If the player guesses wrong, then the program gives feedback and ask to enter an other guess until the guess is correct.
 * Make the range customizable (ask for it before starting the guessing).
 * You can add lives. (optional)
 */

public class GuessMyNumber {

  public static void main(String[] args) {

    System.out.println("Hi! What should be the lowest number of my range?");
    int lowestNr = askUserInput();

    System.out.println("And what should be the highest number?");
    int highestNr = askUserInput();



  }

  public static int askUserInput(){
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    return input;
  }

}
