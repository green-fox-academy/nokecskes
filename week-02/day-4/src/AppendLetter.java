/**
 * Created by Connor on 2017.03.23..
 */
import java.util.*;

public class AppendLetter{

  public static void main(String... args){

    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    // Add "a" to every string in the far list.

    int length = far.size();

    for (int i = 0; i < length; i++){

      String appendedString = far.get(i) + "a";
      far.set(i, appendedString );

    }

    System.out.println(far);
  }
}
