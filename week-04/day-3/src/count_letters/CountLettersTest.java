package count_letters;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

/**
 * Created by Connor on 2017.04.05..
 */
class CountLettersTest {

  CountLetters countLetters = new CountLetters();
  String input;

  @Test
  public void emptyString() {
    input = "";
    HashMap<String, Integer> testerDictionary = new HashMap<>();
    testerDictionary.put("empty", 1);
    assertEquals(testerDictionary, countLetters.generateDictionary(input));
  }

  @Test
  public void simpleString() {
    input = "ababcdcd";
    HashMap<String, Integer> testerDictionary = new HashMap<>();
    testerDictionary.put("a", 2);
    testerDictionary.put("b", 2);
    testerDictionary.put("c", 2);
    testerDictionary.put("d", 2);
    assertEquals(testerDictionary, countLetters.generateDictionary(input));
  }

  @Test
  public void Sentence() {
    input = "Hello, World!";
    HashMap<String, Integer> testerDictionary = new HashMap<>();
    testerDictionary.put("h", 1);
    testerDictionary.put("e", 1);
    testerDictionary.put("l", 3);
    testerDictionary.put("o", 2);
    testerDictionary.put(",", 1);
    testerDictionary.put(" ", 1);
    testerDictionary.put("w", 1);
    testerDictionary.put("r", 1);
    testerDictionary.put("d", 1);
    testerDictionary.put("!", 1);
    assertEquals(testerDictionary, countLetters.generateDictionary(input));
  }
}