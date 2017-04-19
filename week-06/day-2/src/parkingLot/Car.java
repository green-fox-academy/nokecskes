package parkingLot;

/**
 * Created by Connor on 2017.04.19..
 */
public class Car {

  Type type;
  Color color;

  public Car(Type type, Color color) {
    this.type = type;
    this.color = color;
  }

  public Car(int randomType, int randomColor) {
    setRandomType(randomType);
    setRandomColor(randomColor);
  }

  public void setRandomType(int randomType) {
    if (randomType == 0) {
      type = Type.SKODA;
    } else if (randomType == 1) {
      type = Type.TRABANT;
    } else if (randomType == 2) {
      type = Type.SUZUKI;
    } else if (randomType == 3) {
      type = Type.LADA;
    } else if (randomType == 4) {
      type = Type.AUDI;
    } else if (randomType == 5) {
      type = Type.MERCEDES;
    }
  }

  public void setRandomColor(int randomColor) {
    if (randomColor == 0) {
      color = Color.BLUE;
    } else if (randomColor == 1) {
      color = Color.RED;
    } else if (randomColor == 2) {
      color = Color.GREEN;
    } else if (randomColor == 3) {
      color = Color.BLACK;
    } else if (randomColor == 4) {
      color = Color.WHITE;
    } else if (randomColor == 5) {
      color = Color.YELLOW;
    }
  }

}
