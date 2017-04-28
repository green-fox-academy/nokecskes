package twentyPlusOne;

import java.util.Collections;

/**
 * Created by Connor on 2017.04.19..
 */
public enum Color {
  RED(1), BLACK(2);

  int colorValue;

  private Color(int colorValue) {
    this.colorValue = colorValue;
  }

  /*public Color getColorOfValue(int value) {
    Color colorToReturn = new Color(2);
    for (Color color : values()) {
      if (color.colorValue == value) {
        colorToReturn = color;
      }
    }
    return colorToReturn;
  }*/

}
