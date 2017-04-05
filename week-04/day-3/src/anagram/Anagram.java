package anagram;

import java.util.Arrays;

/**
 * Created by Connor on 2017.04.05..
 */
public class Anagram {

  public boolean isAnagram(String string1, String string2) {
    string1 = customizeString(string1);
    string2 = customizeString(string2);
    if (string1.length() != string2.length()) {
      return false;
    }
    string1 = sortString(string1);
    string2 = sortString(string2);
    return string1.equals(string2);
  }

  public String sortString(String toSort) {
    toSort = toSort.toLowerCase();
    char[] toSortArray = toSort.toCharArray();
    Arrays.sort(toSortArray);
    toSort = Arrays.toString(toSortArray);
    return toSort;
  }

  public String customizeString(String toCustomize) {
    toCustomize.replace(" ", "");
    return toCustomize;
  }
}


