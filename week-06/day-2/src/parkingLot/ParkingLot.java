package parkingLot;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Connor on 2017.04.19..
 */
public class ParkingLot {

  ArrayList<Car> parkingLot;
  HashMap<Type, Integer> typeCounter;
  HashMap<Color, Integer> colorCounter;

  public ParkingLot(int numberOfCars) {
    parkingLot = new ArrayList<>();
    typeCounter = new HashMap<>();
    colorCounter = new HashMap<>();
    for (int i = 0; i < numberOfCars; i++) {
      addNewRandomCar();
    }
  }

  public void addNewRandomCar() {
    Car car = new Car(randomNumberGenerator(0, Type.values().length),
            randomNumberGenerator(0, Color.values().length));
    parkingLot.add(car);
    setTypeCounter(car);
    setColorCounter(car);
  }

  public int randomNumberGenerator(int min, int max) {
    int randomNumber = (int) (min + Math.random() * max);
    return randomNumber;
  }

  public void setTypeCounter(Car car) {
    if (typeCounter.get(car.type) != null) {
      typeCounter.put(car.type, typeCounter.get(car.type) + 1);
    } else {
      typeCounter.put(car.type, 1);
    }
  }

  public void setColorCounter(Car car) {
    if (colorCounter.get(car.color) != null) {
      colorCounter.put(car.color, colorCounter.get(car.color) + 1);
    } else {
      colorCounter.put(car.color, 1);
    }
  }

  public void countAndPrintTypes() {
    for (Type type : Type.values()) {
      int number = 0;
      if (typeCounter.get(type) != null) {
        number = typeCounter.get(type);
      }
      System.out.println(type.toString() + " : " + number);
    }
  }

  public void countAndPrintColors() {
    for (Color color : Color.values()) {
      int number = 0;
      if (colorCounter.get(color) != null) {
        number = colorCounter.get(color);
      }
      System.out.println(color.toString() + " : " + number);
    }
  }
}
