package parkingLot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Connor on 2017.04.19..
 */
public class Car {

  Type type;
  Color color;
  Type[] types = Type.values();
  Color[] colors = Color.values();

  public Car(Type type, Color color) {
    this.type = type;
    this.color = color;
  }

  public Car(int randomType, int randomColor) {
    setRandomType(randomType);
    setRandomColor(randomColor);
  }

  public void setRandomType(int randomType) {
    type = types[randomType];
  }

  public void setRandomColor(int randomColor) {
    color = colors[randomColor];
  }

  @Override
  public String toString() {
    return type + " " + color;
  }
}
