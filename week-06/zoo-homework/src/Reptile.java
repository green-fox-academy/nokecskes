/**
 * Created by Connor on 2017.04.17..
 */
public class Reptile extends Animal implements Greet {

  public Reptile(String name) {
    super(name);
  }

  public String greet() {
    return "Hi, I'm a reptile! Nice to meet you.";
  }
}
