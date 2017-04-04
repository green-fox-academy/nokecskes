package green_fox_organization;

/**
 * Created by Connor on 2017.04.04..
 */

/*Create a Mentor class that has the same fields and methods as the Personclass, and has the following additional
fields:
        level: the level of the mentor (junior / intermediate / senior)
methods:
        getGoal(): prints out "Educate brilliant junior software developers."
        introduce(): "Hi, I'm name, a age year old gender level mentor."
The Mentor class has the following constructors:
        Mentor(name, age, gender, level)
        Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate
*/


public class Mentor extends Person {

  String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super();
    this.level = "intermediate";
  }

  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.printf("Hi, I'm %s, a %d year old %s %s mentor.", name, age, gender, level);
  }


}
