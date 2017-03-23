/**
 * Created by Connor on 2017.03.23..
 */
import java.util.*;

public class QuoteSwap{

  public static void main(String... args){

    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code

    // Also, print the sentence to the output with spaces in between.

    int indexDo = list.indexOf("do");
    String wordToChange1 = list.get(indexDo);

    int indexCannot = list.indexOf("cannot");
    String wordToChange2 = list.get(indexCannot);

    list.set(indexDo, wordToChange1);
    list.set(indexCannot, wordToChange2);

    int length = list.size();

    for (int i = 0; i < length; i++){
      System.out.print(list.get(i) + " ");
    }

  }

}

/* First solution for printing:
    String listAsString = list.toString();
    listAsString = listAsString.replace(",", "");
    listAsString = listAsString.replace("[", "");
    listAsString = listAsString.replace("]", "");
    listAsString = listAsString.replace("create", "create,");
*/
