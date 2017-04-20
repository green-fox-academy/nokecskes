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
    char reversedCharAt = stringToTransform.charAt(stringToTransform.length() - index - 1);
    return reversedCharAt;
  }

  @Override
  public int length() {
    return stringToTransform.length();
  }

  @Override
  public CharSequence subSequence(int start, int end) {

    return null;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
