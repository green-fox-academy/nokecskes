package parkingLot;

import java.util.ArrayList;

/**
 * Created by Connor on 2017.04.19..
 */
public class ParkingLot {

  ArrayList<Car> parkingLot;

  public ParkingLot(int numberOfCars) {
    for (int i = 0; i < numberOfCars; i++) {
      addNewCar();
    }
  }

  public void addNewCar() {
    Car car = new Car(randomNumberGenerator(0, 6), randomNumberGenerator(0, 6));
    parkingLot.add(car);
  }

  public int randomNumberGenerator(int min, int max) {
    int randomNumber = (int) (min + Math.random() * max);
    return randomNumber;
  }
}
