/**
 * Created by Connor on 2017.04.17..
 */
public class Animal {

  String name;
  int age;
  String gender;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String greet() {
    return "hello!";
  }

  public String wantChild() {
    return "unknown";
  }

}
