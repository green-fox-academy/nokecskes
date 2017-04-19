package parkingLot;

import java.util.ArrayList;

/**
 * Created by Connor on 2017.04.19..
 */
public class ParkingLot {

  ArrayList<Car> parkingLot;

  public ParkingLot(int numberOfCars) {
    for (int i = 0; i < numberOfCars; i++) {
      addNewRandomCar();
    }
  }

  public void addNewRandomCar() {
    Car car = new Car(randomNumberGenerator(0, Type.values().length), randomNumberGenerator(0, Color.values().length));
    parkingLot.add(car);
  }

  public int randomNumberGenerator(int min, int max) {
    int randomNumber = (int) (min + Math.random() * max);
    return randomNumber;
  }
}
