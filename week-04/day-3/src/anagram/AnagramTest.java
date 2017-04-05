package anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Created by Connor on 2017.04.05..
 */
class AnagramTest {

  Anagram anagramToTest = new Anagram();
  String toTest = "dog";

  @Test
  public void lowercaseStrings() {
    assertTrue(anagramToTest.isAnagram(toTest, "gdo"));
  }

  @Test
  public void multipleCaseStrings() {
    assertTrue(anagramToTest.isAnagram(toTest, "GDO"));
  }

  @Test
  public void differentLenght() {
    assertFalse(anagramToTest.isAnagram(toTest, "dogdog"));
  }

  @Test
  public void differentStrings() {
    assertFalse(anagramToTest.isAnagram(toTest, "bab"));
  }
}