/**
 * Created by Connor on 2017.03.27..
 */

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.xml.bind.SchemaOutputResolver;
import sun.plugin2.message.Conversation;

public class Lotto {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lotto numbers assets/lotto.csv

    try {
      // Reads the content from `lorem_ipsum.txt` in the `assets` folder line by line to a String List
      Path filePath = Paths.get("assets/otos.csv");
      List<String> lines = Files.readAllLines(filePath);

      ArrayList<String> lottoNumbers = new ArrayList<String>();
      for (int i = 0; i < lines.size() ; i++) {
        String oneLine = lines.get(i);
        String[] columnsOfLine = oneLine.split(";");
        for (int j = 11; j < columnsOfLine.length; j++) {
          lottoNumbers.add(columnsOfLine[j]);
        }
      }
      Collections.sort(lottoNumbers);

      HashMap<Integer, Integer> occurances = new HashMap<Integer, Integer>();
      for (int i = 0; i <lottoNumbers.size() ; i++) {
        String currentToBeKey = lottoNumbers.get(i);
        int keyValue = Integer.parseInt(currentToBeKey);
        if (occurances.get(keyValue) != null){
          occurances.put(keyValue, occurances.get(keyValue) + 1);
        }
        else{
          occurances.putIfAbsent(keyValue, 1);
        }
      }

      ArrayList<Integer> valuesFromOccurances = new ArrayList<Integer>();
      for (int i = 0; i < occurances.size(); i++) {
        int[] current = new int[occurances.size()];
        valuesFromOccurances.add(i, occurances.get(i + 1));
      }
      Collections.sort(valuesFromOccurances);

      int minimumOccurance = valuesFromOccurances.get(valuesFromOccurances.size() - 5);
      System.out.println(minimumOccurance);

      for (int i = 0; i < occurances.size(); i++) {
        if(occurances.get(i + 1) > (minimumOccurance)){
          System.out.println();
        }
      }




    } catch (Exception e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
    }


  }

}
