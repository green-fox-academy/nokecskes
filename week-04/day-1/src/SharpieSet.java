import java.util.ArrayList;
import java.util.List;

/**
 * Created by Connor on 2017.04.03..
 */

/*
Create SharpieSet class
  it contains a list of Sharpie
  countUsable() -> sharpie is usable if it has ink in it
  removeTrash() -> removes all unusable sharpies
*/

public class SharpieSet {

  List<Sharpie> sharpies;

  public SharpieSet() {
    this.sharpies = new ArrayList<Sharpie>();
  }

  public void add(Sharpie sharpie) {
    sharpies.add(sharpie);
  }

  public Sharpie get(int index) {
    return sharpies.get(index);
  }


  public int countUsable() {
    int counter = 0;
    for (Sharpie sharpie : this.sharpies) {
      if (sharpie.inkAmount > 0) {
        counter++;
      }
    }
    return counter;
  }

  public void removeTrash() {
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).inkAmount < 1) {
        sharpies.remove(i);
        i--;
      }
    }
  }

  public static void main(String[] args) {
    SharpieSet mySharpies = new SharpieSet();

    Sharpie one = new Sharpie("orange", 10);
    one.inkAmount = 0;
    mySharpies.add(one);

    Sharpie two = new Sharpie("yellow", 10);
    two.inkAmount = 10;
    mySharpies.add(two);

    Sharpie three = new Sharpie("purple", 10);
    mySharpies.add(three);

    System.out.println(mySharpies.get(0).inkAmount);

    int good = mySharpies.countUsable();
    System.out.println(good);

    mySharpies.removeTrash();

    System.out.println(mySharpies.get(0).inkAmount);
    System.out.println(mySharpies.get(1).inkAmount);
  }

}
