import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Connor on 2017.04.17..
 */
public class WriteMultipleLines {
  // Create a function that takes 3 parameters: a path, a word and a number,
  // than it should write to a file.
  // The path parameter should be a string, that describes the location of the file.
  // The word parameter should be a string, that will be written to the file as lines
  // The number parameter should describe how many lines the file should have.
  // So if the word is "apple" and the number is 5, than it should write 5 lines
  // to the file and each line should be "apple"
  // The function should not raise any error if it could not write the file.

  public static void main(String[] args) {
    String path = askUserStringInput("Give me the location of the file: ");
    String word = askUserStringInput("Give me the word to write: ");
    int numberOfLines = Integer.parseInt(askUserStringInput("Give me the number of lines: "));
    writeToFile(path, word, numberOfLines);
  }

  public static String askUserStringInput(String instruction) {
    System.out.println(instruction);
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    return input;
  }

  public static void writeToFile(String path, String word, int numberOfLines) {
    try {
      Path filePath = Paths.get(path);
      ArrayList<String> fileContent = new ArrayList<>();
      for (int i = 0; i < numberOfLines; i++) {
        fileContent.add(word);
      }
      Files.write(filePath, fileContent);
    } catch (IOException e) {
      System.out.println("Sorry, an error occurred, was unable to write to file.");
    }
  }
}
