import java.util.Scanner;

/**
 * Created by Connor on 2017.03.25..
 */
public class DrawSquare {

  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %   %
    // %   %
    // %   %
    // %   %
    // %%%%%
    //
    // The square should have as many lines as the number was

    int height = inputNr();

    String symbol = "%";
    String space = " ";

    for (int i = 0; i < height ; i++) {
      if(i == 0 || i == (height - 1)){
        for (int j = 0; j < (height - 1) ; j++) {
          System.out.print(symbol);
        }
      }
      else{
        for (int j = 0; j < (height - 1); j++) {
          if (j == 0 || j == (height - 2)){
            System.out.print(symbol);
          }
          else{
            System.out.print(space);
          }
        }
      }
      System.out.println();
    }
  }

  public static int inputNr (){

    Scanner scanner = new Scanner(System.in);
    int userGivenNr = 0;

    do{
      System.out.print("Please give me a positive number: ");
      userGivenNr = scanner.nextInt();
    } while (userGivenNr < 1);

    return userGivenNr;
  }

}
