import java.net.SocketTimeoutException;

/**
 * Created by Connor on 2017.03.25..
 */
public class FizzBuzz {

  public static void main(String[] args) {
    // Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print “Fizz” instead of the number
    // and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”.

    for (int i = 0; i < 100; i++) {

      int number = i + 1;

      if((number % 3) == 0 || (number % 5) == 0){
        if ((number % 3) == 0) {
          System.out.print("Fizz");
        }
        if ((number % 5) == 0) {
          System.out.print("Buzz");
        }
      }
      else{
        System.out.print(number);
      }
      System.out.println();
    }
  }
}
