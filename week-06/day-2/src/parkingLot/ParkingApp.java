package parkingLot;

/**
 * Created by Connor on 2017.04.19..
 */
public class ParkingApp {

  public static void main(String[] args) {
    ParkingLot parkingLot = new ParkingLot(256);
    parkingLot.countAndPrintTypes();
    parkingLot.countAndPrintColors();
  }
}
