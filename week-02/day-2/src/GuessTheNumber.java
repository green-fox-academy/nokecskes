import java.util.Scanner;

/**
 * Created by Connor on 2017.03.25..
 */
public class GuessTheNumber {

  public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stried number is lower
    // You found the number: 8

    int number = 8;
    int guess = 0;

    do{
      guess = askUserInput();
      if(guess < number){
        System.out.println("The stored number is higher");
      }
      else if(guess > number){
        System.out.println("The stored number is lower");
      }
    }while(number != guess);

    System.out.println("You found the number: 8");

  }

  public static int askUserInput(){
    System.out.println("Guess the number:");
    Scanner scanner= new Scanner(System.in);
    int userInput = scanner.nextInt();
    return userInput;
  }

}
