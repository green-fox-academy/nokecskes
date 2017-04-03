/**
 * Created by Connor on 2017.04.03..
 */

/*
Create a Student class that has the same fields and methods as the Person class, and has the following additional
fields:
        previousOrganization: the name of the student’s previous company / school
        skippedDays: the number of days skipped from the course
methods:
        getGoal(): prints out "Be a junior software developer."
        introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
        skipDays(numberOfDays): increases skippedDays by numberOfDays
The Student class has the following constructors:
        Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
        Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0

*/


public class Student01 {

  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;

  public Student01(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student01() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public void introduce() {
    System.out.printf("Hi, I'm %s, a %d year old %s from %s who skipped %d days from the course already.\n", name, age, gender, previousOrganization, skippedDays);
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  public static void main(String[] args) {
    Student01 jane = new Student01();
    jane.getGoal();
    jane.introduce();
    jane.skipDays(3);
    jane.introduce();
  }

}
