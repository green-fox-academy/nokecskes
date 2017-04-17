import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
  // Open a file called "my-file.txt"
  // Write your name in it as a single line
  // If the program is unable to write the file,
  // then it should print an error message like: "Unable to write file: my-file.txt"


  public static void main(String[] args) {
    String fileName = askUserFileName();
    List<String> content = new ArrayList();
    content.add("Noemi");
    try {
      Path filePath = Paths.get(fileName);
      Files.write(filePath, content);
    } catch (Exception e) {
      System.out.println("Unable to write file:" + fileName);
    }
  }

  public static String askUserFileName() {
    System.out.println("Please give me the filename: ");
    Scanner scanner = new Scanner(System.in);
    String fileName = scanner.nextLine();
    return fileName;
  }
}