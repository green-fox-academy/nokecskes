package parkingLot;

/**
 * Created by Connor on 2017.04.19..
 */
public enum Color {
  BLUE(1), RED(2), GREEN(3), BLACK(4), WHITE(5), YELLOW(6);

  private int colorValue;

  private Color (int colorValue) {
    this.colorValue = colorValue;
  }

  public int getColorValue () {
    return colorValue;
  }
}
