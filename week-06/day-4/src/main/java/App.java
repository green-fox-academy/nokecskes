/**
 * Created by Connor on 2017.04.06..
 */
public class App {

  public static void main(String[] args) {

    ArgumentHandler handler = new ArgumentHandler(args);
    if (handler.validArgument()) {
      ToDoList myToDoList = new ToDoList(args);
    }
  }
}



