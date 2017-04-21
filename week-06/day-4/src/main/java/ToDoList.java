import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Connor on 2017.04.06..
 */

public class ToDoList {

  private String[] arguments;
  private Path myListPath;
  private List<String> lines;
  private ArrayList<ToDo> toDoList;

  public ToDoList(String[] arguments) {
    this.arguments = arguments;
    toDoList = new ArrayList<>();
    lines = new ArrayList<>();
    readInToDoList();
    fillToDoList();
    handleToDoList();
  }

  public void readInToDoList() {
    lines.clear();
    try {
      myListPath = Paths.get("mylist.txt");
      lines = Files.readAllLines(myListPath);
    } catch (Exception e) {
      System.out.println("error");
    }
  }

  public void fillToDoList() {
    for (String line : lines) {
      addToList(line);
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
        System.out.println((i + 1) + " - " + toDoList.get(i).getTask());
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

