/**
 * Created by Connor on 2017.04.03..
 */

/*
Create a Mentor class that has the same fields and methods as the Person class, and has the following additional
fields:
   level: the level of the mentor (junior / intermediate / senior)
methods:
    getGoal(): prints out "Educate brilliant junior software developers."
    introduce(): "Hi, I'm name, a age year old gender level mentor."
The Mentor class has the following constructors:
    Mentor(name, age, gender, level)
    Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate
*/

public class Mentor {

  String name;
  int age;
  String gender;
  String level;

  public Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  public Mentor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    level = "intermediate";
  }

  public void introduce() {
    System.out.printf("Hi, I'm %s, a %d year old %s %s level mentor.\n", name, age, gender, level);
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public static void main(String[] args) {
    Mentor jane = new Mentor();
    jane.introduce();
    jane.getGoal();
  }



}
