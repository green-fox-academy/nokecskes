package extension;

import java.util.Arrays;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c)
      return a;
    else if (b > c)
      return b;
    else
      return c;
  }

  int median(List<Integer> pool) {
    return pool.get((pool.size()-1)/2);
  }

  boolean isVowel(char c) {
    c = charToLowerCase(c);
    return Arrays.asList('a', 'á', 'u', 'ú', 'ü', 'ű', 'o', 'ó', 'ö', 'ő', 'e', 'é', 'i', 'í').contains(c);
  }

  char charToLowerCase(char toChange) {
    //other solution with ASCII
    int asciiLetter = (int) toChange;
    if(asciiLetter > 64 && asciiLetter < 91) {
      asciiLetter += 32;
      toChange = (char) asciiLetter;
    }
    return toChange;


    /* one solution with conversion:
    String letter = Character.toString(toChange);
    letter = letter.toLowerCase();
    toChange = letter.charAt(0);
    return toChange;*/
  }


  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split(""+c));
        i+=2;
        length+=2;
      }
    }
    return teve;
  }
}
