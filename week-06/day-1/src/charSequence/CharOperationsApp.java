package charSequence;

/**
 * Created by Connor on 2017.04.18..
 */
public class CharOperationsApp {

  public static void main(String[] args) {
    CharOperations charop = new CharOperations("myWord");

    char charAtIndex = charop.charAt(5);
    System.out.println(charAtIndex);
    int length = charop.length();
    System.out.println(length);
    CharSequence subSequence = charop.subSequence(2, 4);
    System.out.println(subSequence);
    System.out.println(charop.toString());


  }
}
