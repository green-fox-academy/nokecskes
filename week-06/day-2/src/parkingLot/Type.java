package parkingLot;

/**
 * Created by Connor on 2017.04.19..
 */
public enum Type {
  SKODA(1), TRABANT(2), SUZUKI(3), LADA(4), AUDI(5), MERCEDES(6);

  private int typeValue;

  private Type (int typeValue) {
    this.typeValue = typeValue;
  }

  public int getTypeValue () {
    return typeValue;
  }
}
