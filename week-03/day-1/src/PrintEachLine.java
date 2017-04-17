import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class PrintEachLine {

  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"

    String fileName = askUserFileName();
    printLines(fileName);
  }

  public static String askUserFileName() {
    System.out.println("Please give me the filename: ");
    Scanner scanner = new Scanner(System.in);
    String fileName = scanner.nextLine();
    return fileName;
  }

  public static void printLines(String fileName) {
    try {
      Path filePath = Paths.get(fileName);
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Unable to read file: " + fileName);
    }
  }
}
