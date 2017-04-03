import java.util.ArrayList;

public class TestInput {

  public static void main(String[] args) {

    ArrayList<Person> people1 = new ArrayList<>();
    ArrayList<Student01> people2 = new ArrayList<>();
    ArrayList<Mentor> people3 = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
    people1.add(mark);
    Person jane = new Person();
    people1.add(jane);
    Student01 john = new Student01("John Doe", 20, "male", "BME");
    people2.add(john);
    Student01 student = new Student01();
    people2.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
    people3.add(gandhi);
    Mentor mentor = new Mentor();
    people3.add(mentor);
    Sponsor sponsor = new Sponsor();
    Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");

    student.skipDays(3);

    for (int i = 0; i < 5; i++) {
      sponsor.hire();
    }
    for (int i = 0; i < 3; i++) {
      elon.hire();
    }

    for(Person person : people1) {
      person.introduce();
      person.getGoal();
    }
    for(Student01 currentStudent : people2) {
      currentStudent.introduce();
      currentStudent.getGoal();
    }
    for(Mentor currentMentor : people3) {
      currentMentor.introduce();
      currentMentor.getGoal();
    }

    sponsor.introduce();
    sponsor.getGoal();
    elon.introduce();
    elon.getGoal();
  }

}
