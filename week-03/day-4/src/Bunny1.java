import java.util.Scanner;

/**
 * Created by Connor on 2017.03.30..
 */
public class Bunny1 {

  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

    int bunnies = getUserInput();

  }

  public static int getUserInput() {
    Scanner scanner = new Scanner(System.in);
    int inputInt = 0;
    do {
      System.out.println("How many bunnies do you have?");
      inputInt = scanner.nextInt();
    }while(inputInt < 1);
    return inputInt;
  }



}
