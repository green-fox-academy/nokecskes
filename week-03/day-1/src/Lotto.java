/**
 * Created by Connor on 2017.03.27..
 */

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lotto {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lotto numbers assets/lotto.csv

    try {
      // Reads the content from `lorem_ipsum.txt` in the `assets` folder line by line to a String List
      Path filePath = Paths.get("assets/otos.csv");
      List<String> lines = Files.readAllLines(filePath);
      ArrayList<String> lottoNumbers = new ArrayList<String>();
      HashMap<String, Integer> occurances = new HashMap<String, Integer>();

      for (int i = 0; i < 3 ; i++) {
        String oneLine = lines.get(i);
        System.out.println(oneLine);
        String[] columnsOfLine = oneLine.split(";");
        for (int j = 11; j < columnsOfLine.length; j++) {
          System.out.println(columnsOfLine[j]);
          lottoNumbers.add(columnsOfLine[j]);
        }
      }

      Collections.sort(lottoNumbers);

      for (int i = 0; i <lottoNumbers.size() ; i++) {
        String currentToBeKey = lottoNumbers.get(i);
        if (occurances.get(currentToBeKey) != null){
          occurances.put(currentToBeKey, occurances.get(currentToBeKey) + 1);
        }
        else{
          occurances.putIfAbsent(currentToBeKey, 1);
        }
      }

      System.out.println(occurances.get("50"));

    } catch (Exception e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
    }


  }

}
