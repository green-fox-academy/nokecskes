package greenFoxOrganizationCompare;

/**
 * Created by Connor on 2017.04.04..
 */

/*Create a Person class with the following fields:
        name: the name of the person
        age: the age of the person (whole number)
        gender: the gender of the person (male / female)
And the following methods:
        introduce(): prints out "Hi, I'm name, a age year old gender."
        getGoal(): prints out "My goal is: Live for the moment!"
And the following constructors:
        Person(name, age, gender)
        Person(): sets name to Jane Doe, age to 30, gender to female
  */


public class Person {

  String name;
  int age;
  String gender;

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }

  public void introduce() {
    System.out.printf("Hi, I'm %s, a %d year old %s.", name, age, gender);
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}
