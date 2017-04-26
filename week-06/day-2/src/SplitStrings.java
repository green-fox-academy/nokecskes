import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Connor on 2017.04.26..
 */
public class SplitStrings {

  public static void main(String[] args) {
    String toSplit = getStringInput();
    int indexOfSplit = getIndexInput();

    ArrayList<String> splitString = new ArrayList<>();
    splitString = splitString(toSplit, indexOfSplit);
    System.out.println(splitString.toString());
  }

  public static String getStringInput() {
    System.out.println("Give me the string that you want to split: ");
    Scanner scanner = new Scanner(System.in);
    String toSplit = scanner.nextLine();
    return toSplit;
  }

  public static int getIndexInput() {
    System.out.println("Give me the index where you want to split: ");
    Scanner scanner = new Scanner(System.in);
    int indexOfSplit = scanner.nextInt();
    return indexOfSplit;
  }

  public static ArrayList<String> splitString(String toSplit, int indexOfSplit) {
    ArrayList<String> splitString = new ArrayList<>();
    try {
      String firstPart = toSplit.substring(0, indexOfSplit);
      String secondPart = toSplit.substring(indexOfSplit, toSplit.length());
      splitString.add(firstPart);
      splitString.add(secondPart);
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return splitString;
  }

}
