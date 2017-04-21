import java.util.List;

/**
 * Created by Connor on 2017.04.06..
 */
public class ToDo {

  private String task;
  private boolean checked;

  public ToDo(String task) {
    this.task = task;
    checked = false;
  }

  public ToDo(String[] taskLine) {
    task = taskLine[0];
    if(taskLine[1].equals("0")) {
      checked = false;
    } else {
      checked = true;
    }
  }


  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public boolean isChecked() {
    return checked;
  }

  public void setChecked(boolean checked) {
    this.checked = checked;
  }

  public void setToChecked() {
    if (isChecked()) {
      System.out.println("It's already checked!");
    } else {
      task = "[X] " + task.substring(3);
      checked = true;
    }
  }
}
