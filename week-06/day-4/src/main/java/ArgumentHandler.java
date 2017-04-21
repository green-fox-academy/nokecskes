import com.sun.org.apache.xpath.internal.Arg;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Connor on 2017.04.06..
 */
public class ArgumentHandler {

  String[] arguments;

  public ArgumentHandler(String[] arguments) {
    this.arguments = arguments;
  }

  public boolean validArgument() {
    boolean validArgument = false;
    if (noArgument()) {
      printUsage();
    } else if (!existingArgument() || !validLength()) {
      System.out.println("Unsupported argument");
      printUsage();
    } else {
      validArgument = true;
    }
    return validArgument;
  }

  public boolean noArgument() {
    if (arguments.length == 0) {
      return true;
    }
    return false;
  }

  public boolean validLength() {
    if (arguments.length == 1 || arguments.length == 2) {
      return true;
    }
    return false;
  }

  public boolean existingArgument() {
    if (arguments[0].equals("-l") || arguments[0].equals("-a") || arguments[0].equals("-r")
            || arguments[0].equals("-c")) {
      return true;
    }
    return false;
  }

  public void printUsage() {
    try {
      Path usagePath = Paths.get("ToDoUsage.txt");
      List<String> usageLines = Files.readAllLines(usagePath);
      for (String usageLine : usageLines) {
        System.out.println(usageLine);
      }
    } catch (Exception e) {
      System.out.println("Sorry, wasn't able to load in the manual.");
    }

  }
}
