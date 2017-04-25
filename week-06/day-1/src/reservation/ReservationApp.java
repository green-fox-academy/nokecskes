package reservation;
//import com.greenfox.bx.*;


import java.util.ArrayList;

/**
 * Created by Connor on 2017.04.25..
 */
public class ReservationApp {

  public static void main(String[] args) {
    ArrayList<Reservation> reservationList = new ArrayList<>();
    for (int i = 0; i < 8; i++) {
      Reservation reservation = new Reservation();
      reservationList.add(reservation);
    }

    for (Reservation reservation : reservationList) {
      System.out.println(reservation);
    }
  }

}
