package charSequence;

/**
 * Created by Connor on 2017.04.18..
 */
public class CharOperationsApp {

  public static void main(String[] args) {
    CharOperations charop = new CharOperations("myWord");

    char charAtIndex = charop.charAt(4);
    System.out.println(charAtIndex);
    int length = charop.length();
    System.out.println(length);


  }
}
