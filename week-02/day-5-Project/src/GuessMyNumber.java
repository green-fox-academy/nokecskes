/**
 * Created by Connor on 2017.03.26..
 */

/**
 * Write a program where the program chooses a number between 1 and 100.
 * The player is then asked to enter a guess.
 * If the player guesses wrong, then the program gives feedback and ask to enter an other guess until the guess is correct.
 * Make the range customizable (ask for it before starting the guessing).
 * You can add lives. (optional)
 */

import java.util.Scanner;

public class GuessMyNumber {

  public static void main(String[] args) {

    System.out.println("Hi! What should be the lowest number of my range?");
    int lowestNr = askUserInput();

    System.out.println("And what should be the highest number?");
    int highestNr = askUserInput();

    int toGuess = numberGenerator(lowestNr, highestNr);
    int lives = 5;
    int lifeCounter = lives;

    System.out.printf("I've the number between %d and %d. You have %d lives.\n", lowestNr, highestNr, lives);

    do {
      int guess = askUserInput();
      if (guess < toGuess){
        lives -=1;
        System.out.printf("Too low. You have %d lives left.\n", lives);
      }
      else if(guess > toGuess){
        lives -=1;
        System.out.printf("Too high. You have %d lives left.\n", lives);;
      }
      else{
        System.out.printf("Congratulations. You won!\n");
      }
    }while(lives > 0);

    if(lives == 0){
      System.out.printf("Sorry, this time you couldn't figure it out! The number was: %d\n", toGuess);
    }
  }

  public static int askUserInput(){
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    return input;
  }

  public static int numberGenerator(int minimum, int maximum) {
    int randomNr = minimum + (int) (Math.random() * ((maximum - minimum) + 1));
    return randomNr;
  }

}
