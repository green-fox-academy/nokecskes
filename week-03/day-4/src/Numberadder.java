import java.util.Scanner;

/**
 * Created by Connor on 2017.03.30..
 */
public class Numberadder {

  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    int sumTo = getUserInput();
    System.out.println(sum(sumTo));
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

  public static int sum(int end) {
    if(end == 1) {
      return 1;
    }
    else{
      int sum = end + sum(end - 1);
      return sum;
    }
  }

}
