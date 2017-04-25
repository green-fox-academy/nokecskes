package charSequence;

/**
 * Created by Connor on 2017.04.18..
 */
public class CharOperations implements CharSequence {

  String stringToTransform;

  public CharOperations (String stringToTransform) {
    this.stringToTransform = stringToTransform;
  }

  @Override
  public char charAt(int index) {
    char reversedCharAt = stringToTransform.charAt(stringToTransform.length() - 1 - index);
    return reversedCharAt;
  }

  @Override
  public int length() {
    return stringToTransform.length();
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    start = stringToTransform.length() - 1 - start;
    end = stringToTransform.length() - 1 - end;
    String reversedSubSequence = "";
    for (int i = start; i > end - 1 ; i--) {
      reversedSubSequence += stringToTransform.charAt(i);
    }
    return reversedSubSequence;
  }

  @Override
  public String toString() {
    String reversedString = "";
    for (int i = stringToTransform.length(); i > 0 ; i--) {
      reversedString += stringToTransform.charAt(i - 1);
    }
    return reversedString;
  }
}
