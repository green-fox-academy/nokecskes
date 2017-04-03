/**
 * Created by Connor on 2017.04.03..
 */
/*
  Student
    learn()
    question(teacher) -> calls the teachers answer method
*/

public class Student {

  public Student() {
  }

  public void learn() {
    System.out.println("I'm learning!");
  }

  public void question(Teacher teacher) {
    teacher.answer();
  }
}
