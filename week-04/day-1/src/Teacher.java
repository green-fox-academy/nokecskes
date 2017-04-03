/**
 * Created by Connor on 2017.04.03..
 */
/*Teacher
    teach(student) -> calls the students learn method
    answer()
*/

public class Teacher {

  public Teacher() {
  }

  public void teach(Student student) {
    student.learn();
  }

  public void answer() {
    System.out.println("I answer.");
  }
}
