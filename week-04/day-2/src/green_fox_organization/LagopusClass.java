package green_fox_organization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Connor on 2017.04.04..
 */
/*
Create a LagopusClass class that has the following
fields:
        className: the name of the class
        students: a list of Students
        mentors: a list of Mentors
methods:
        addStudent(Student): adds the given Student to students list
        addMentor(Mentor): adds the given Mentor to mentors list
        info(): prints out "Lagopus className class has students.size students and mentors.size mentors."
The LagopusClass class has the following constructors:
        LagopusClass(className): beside the given parameter, it sets students and mentors as empty lists
*/

public class LagopusClass {

  String className;
  List<Student> students;
  List<Mentor> mentors;

  public LagopusClass(String className) {
    this.className = className;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out
            .printf("Lagopus %s class has %d students and %d mentors.", className, students.size(),
                    mentors.size());
  }

}
