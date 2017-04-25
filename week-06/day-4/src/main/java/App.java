import java.util.Scanner;

/**
 * Created by Connor on 2017.04.06..
 */
public class App {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
   // String userInput = scanner.nextLine();
    //String[] args2 = userInput.split(" ");

    ArgumentHandler handler = new ArgumentHandler(args);
    if (handler.validArgument()) {
      ToDoList myToDoList = new ToDoList(args);
    }
  }
}



