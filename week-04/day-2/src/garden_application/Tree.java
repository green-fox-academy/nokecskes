package garden_application;

/**
 * Created by Connor on 2017.04.04..
 */
public class Tree extends Plant {

  public Tree(String color, float waterAmount) {
    super(color, waterAmount);
  }

  @Override
  public boolean needsWater() {
    return waterAmount < 10;
  }

  @Override
  public void status() {
    if (waterAmount < 10) {
      System.out.printf("The %s Tree needs water.\n", color);
    } else {
      System.out.printf("The %s Tree doesn't need water.\n", color);
    }
  }

  @Override
  public void watering(float receivedWater) {
    waterAmount += receivedWater * 0.4;
  }

}
