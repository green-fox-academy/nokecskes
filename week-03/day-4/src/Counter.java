import java.util.Scanner;

/**
 * Created by Connor on 2017.03.30..
 */

public class Counter {

  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and counts down from n.

    int countFrom = getUserInput();
    countBack(countFrom);
  }

  public static int getUserInput() {
    Scanner scanner = new Scanner(System.in);
    int inputInt = 0;
    do {
      System.out.println("Give me a non negative number: ");
      inputInt = scanner.nextInt();
    }while(inputInt < 0);
    return inputInt;
  }

  public static int countBack(int start) {
    if(start == 0) {
      System.out.println(0);
    }
    else {
      System.out.println(start);
      countBack(start - 1);

    }
    return(start);
  }

}
