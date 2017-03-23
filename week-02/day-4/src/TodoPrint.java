/**
 * Created by Connor on 2017.03.23..
 */
public class TodoPrint {

  public static void main(String... args){

    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected outpt:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    String todoText = " - Buy milk\n";
    String todoTitle = "My todo:\n";
    String todoText2 = " - Download games\n";
    String todoGames = " \t - Diablo";

    String todo = ((todoTitle.concat(todoText)).concat(todoText2)).concat(todoGames);

    System.out.println(todo);

  }

}
