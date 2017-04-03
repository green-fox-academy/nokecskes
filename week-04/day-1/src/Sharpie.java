/**
 * Created by Connor on 2017.04.03..
 */
public class Sharpie {
  /*
    Create Sharpie class
    We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
    When creating one, we need to specify the color and the width
    Every sharpie is created with a default 100 as inkAmount
    We can use() the sharpie objects
    which decreases inkAmount
  */

  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, int width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void use() {
    inkAmount -= 5;
  }

  public static void main(String[] args) {
    Sharpie one = new Sharpie("orange", 10);
    System.out.println(one.inkAmount);
    one.use();

    Sharpie two = new Sharpie("yellow", 5);
    for (int i = 0; i < 5; i++) {
      two.use();
    }

    System.out.println(one.inkAmount);
    System.out.println(two.inkAmount);
  }

}
