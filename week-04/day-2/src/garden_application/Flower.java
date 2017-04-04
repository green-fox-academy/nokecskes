package garden_application;

/**
 * Created by Connor on 2017.04.04..
 */
public class Flower extends Plant {

  public Flower(String color, float waterAmount) {
    super(color, waterAmount);
  }

  @Override
  public boolean needsWater() {
    return waterAmount < 5;
  }

  @Override
  public void status() {
    if (waterAmount < 5) {
      System.out.printf("The %s Flower needs water.\n", color);
    } else {
      System.out.printf("The %s Flower doesn't need water.\n", color);
    }
  }

  @Override
  public void watering(float receivedWater) {
    waterAmount += receivedWater * 0.75;
  }

}
