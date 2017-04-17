/**
 * Created by Connor on 2017.04.17..
 */
public class Animal {

  String name;
  int age;
  String gender;

  public Animal(String name) {
    this.name = name;
    age = 0;
    gender = "unknown";
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getGender() {
    return gender;
  }

  public String wantChild() {
    return "want a child from an egg!";
  }

}
