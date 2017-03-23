/**
 * Created by Connor on 2017.03.23..
 */
import java.util.*;

public class IsInList{

  public static void main(String... args){

    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

    // Check if list contains all of the following elements: 4,8,12,16
    // Print "true" if it contains all, otherwise print "false"
    // Can you do both the different approaches you tried in the previous one?

    int isInList = list.indexOf(4) * list.indexOf(8) * list.indexOf(12) * list.indexOf(16);

    if (isInList > 0){
      System.out.print("true");
    }
    else{
      System.out.print("false");
    }

  }
}