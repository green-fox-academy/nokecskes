import com.opencsv.CSVReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Connor on 2017.04.06..
 */

public class ToDoList {

  private String[] arguments;
  private Path myListPath;
  private List<String[]> toDoLine;
  private ArrayList<ToDo> toDoList;

  private List<String> lines;


  public ToDoList(String[] arguments) {
    this.arguments = arguments;
    toDoLine = new ArrayList<>();
    toDoList = new ArrayList<>();
    lines = new ArrayList<>();
    readInToDoList();
    fillToDoList();
    handleToDoList();
  }

  public void readInToDoList() {
    lines.clear();
    try {
      CSVReader reader = new CSVReader(new FileReader("src/main/java/myList.csv"), ';');
      toDoLine = reader.readAll();
    } catch (Exception e) {
      System.out.println("Sorry, couldn't open the file.");
    }


    /*try {
      myListPath = Paths.get("mylist.txt");
      lines = Files.readAllLines(myListPath);
    } catch (Exception e) {
      System.out.println("error");
    }*/
  }

  public void fillToDoList() {
    for (String[] line : toDoLine) {
      ToDo toDo = new ToDo(line);
      toDoList.add(toDo);
    }
  }

  public void addToList(String taskToAdd) {
    ToDo toDo = new ToDo(taskToAdd);
    toDoList.add(toDo);
  }

  public void handleToDoList() {
    if (arguments[0].equals("-l")) {
      printTasks();
    } else if (arguments[0].equals("-a")) {
      addTask();
    } else if (arguments[0].equals("-r")) {
      removeTask();
    } else if (arguments[0].equals("-c")) {
      checkTask();
    }
  }

  public void printTasks() {
    if (toDoList.size() == 0) {
      System.out.println("No todos for today! :)");
    } else {
      for (int i = 0; i < toDoList.size(); i++) {
        String checkStatus;
        if (toDoList.get(i).isChecked()) {
          checkStatus = "[X] ";
        } else {
          checkStatus = "[ ] ";
        }
        System.out.print((i + 1) + " - " + checkStatus + toDoList.get(i).getTask());
      }
    }
  }

  public void addTask() {
    if (arguments.length == 1) {
      System.out.println("Unable to add: no task provided");
    } else {
      String task = "[ ] " + arguments[1];
      addToList(task);
    }
    writeFile();
  }

  public void removeTask() {
    if (validIndex("remove")) {
      toDoList.remove(Integer.parseInt(arguments[1]) - 1);
      writeFile();
    }
  }

  public void checkTask() {
    if (validIndex("check")) {
      toDoList.get(Integer.parseInt(arguments[1]) - 1).setToChecked();
      writeFile();
    }
  }

  public boolean validIndex(String task) {
    int index = 0;

    if (arguments.length == 1) {
      System.out.println("Unable to " + task + ": no index provided");
      return false;
    }

    try {
      index = Integer.parseInt(arguments[1]) - 1;
    } catch (NumberFormatException e) {
      System.out.println("Unable to " + task + ": index is not a number");
      return false;
    }

    if (index > lines.size() || index < 0) {
      System.out.println("Unable to " + task + ": index is out of bound");
      return false;
    }
    return true;
  }

  public void writeFile() {
    try {
      lines.clear();
      for (ToDo toDo : toDoList) {
        lines.add(toDo.getTask());
      }
      Files.write(myListPath, lines);
    } catch (Exception e) {
      System.out.println("error");
    }
  }


}

