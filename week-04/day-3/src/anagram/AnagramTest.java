package anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Created by Connor on 2017.04.05..
 */
class AnagramTest {

  Anagram anagramToTest = new Anagram();
  boolean testResult = true;
  String toTest = "dog";

  @Test
  public void lowercaseStrings() {
    assertEquals(testResult, anagramToTest.isAnagram(toTest, "gdo"));
  }

  @Test
  public void multipleCaseStrings() {
    assertEquals(testResult, anagramToTest.isAnagram(toTest, "GDO"));
  }

  @Test
  public void differentLenght() {
    assertEquals(!testResult, anagramToTest.isAnagram(toTest, "dogdog"));
  }

  @Test
  public void differentStrings() {
    assertEquals(!testResult, anagramToTest.isAnagram(toTest, "bab"));
  }
}