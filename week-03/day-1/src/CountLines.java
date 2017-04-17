import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Connor on 2017.04.17..
 */
public class CountLines {
  // Write a function that takes a filename as string,
  // then returns the number of lines the file contains.
  // It should return zero if it can't open the file, and
  // should not raise any error.

  public static void main(String[] args) {
    String fileName = askUserFileName();
    int numberOfLines = getNumberOfLines(fileName);
    System.out.println("This file contains " + numberOfLines + " lines.");
  }

  public static String askUserFileName() {
    System.out.println("Please give me the filename: ");
    Scanner scanner = new Scanner(System.in);
    String fileName = scanner.nextLine();
    return fileName;
  }

  public static int getNumberOfLines(String fileName) {
    try {
      Path filePath = Paths.get(fileName);
      List<String> lines = Files.readAllLines(filePath);
      int numberOfLines = lines.size();
      return numberOfLines;
    } catch (IOException e) {
      System.out.println("Unable to read file: " + fileName);
      return 0;
    }
  }
}
