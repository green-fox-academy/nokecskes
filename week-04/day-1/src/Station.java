/**
 * Created by Connor on 2017.04.03..
 */
/*
Station
  gasAmount
  refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
*/

public class Station {

  int gasAmount;

  public Station() {
    gasAmount = 1000;
  }

  public void refill(Car car) {
    this.gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
  }

  public static void main(String[] args) {
    Car trabant = new Car();
    System.out.println(trabant.capacity);
    System.out.println(trabant.gasAmount);

    Station station = new Station();
    System.out.println(station.gasAmount);

    for (int i = 0; i < 5; i++) {
      station.refill(trabant);
    }
    System.out.println(trabant.gasAmount);
    System.out.println(station.gasAmount);
  }
}
