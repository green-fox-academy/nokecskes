package garden_application;

/**
 * Created by Connor on 2017.04.04..
 */
public class Plant {

  String color;
  float waterAmount;

  public Plant(String color, float waterAmount) {
    this.color = color;
    this.waterAmount = waterAmount;
  }

  public boolean needsWater() {
    return false;
  }

  public void watering(float receivedWater) {
  }

  public void status() {
  }

}
