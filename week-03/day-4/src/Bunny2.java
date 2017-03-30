import java.util.Scanner;

/**
 * Created by Connor on 2017.03.30..
 */
public class Bunny2 {

  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    int yummyBunnies = getUserInput();
    System.out.println(countMultiEaredBunnies(yummyBunnies));
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

  public static int countMultiEaredBunnies(int bunnyNumber) {
    if (bunnyNumber == 1){
      return 2;
    }
    else if((bunnyNumber % 2) == 0 ) {
      int bunnyFloppiness = 3 + countMultiEaredBunnies(bunnyNumber - 1);
      return bunnyFloppiness;
    }
    else {
      int bunnyFloppiness = 2 + countMultiEaredBunnies(bunnyNumber - 1);
      return bunnyFloppiness;
    }
  }

}
