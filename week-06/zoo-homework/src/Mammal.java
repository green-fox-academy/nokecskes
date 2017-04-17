/**
 * Created by Connor on 2017.04.17..
 */
public class Mammal extends Animal implements Greet {

  public Mammal(String name) {
    super(name);
  }

  @Override
  public String wantChild() {
    return "want a child from my uterus!";
  }

  public String greet() {
    return "Hi, I'm a mammal! Nice to meet you.";
  }
}
