package count_letters;

import java.util.HashMap;

/**
 * Created by Connor on 2017.04.05..
 */
public class CountLetters {

  HashMap<String, Integer> dictionary;

  public CountLetters() {
    dictionary = new HashMap<>();
  }

  public HashMap<String, Integer> generateDictionary(String toCount) {
    if(toCount == ""){
      dictionary.put("empty", 1);
      return dictionary;
    }

    toCount = toCount.toLowerCase();
    for (int i = 0; i < toCount.length(); i++) {
      String currentStringElt = toCount.substring(i, i + 1);
      if (!dictionary.containsKey(currentStringElt)) {
        dictionary.put(currentStringElt, 1);
      } else {
        dictionary.put(currentStringElt, dictionary.get(currentStringElt) + 1);
      }
    }
    return dictionary;
  }
}
