/**
 * Created by Connor on 2017.04.17..
 */
public class Bird extends Animal implements Greet {

  public Bird(String name) {
    super(name);
  }

  public String greet() {
    return "Hi, I'm a bird! Flap flap flap.";
  }
}
