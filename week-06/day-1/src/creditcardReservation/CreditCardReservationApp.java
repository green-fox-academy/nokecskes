package creditcardReservation;

import java.util.ArrayList;

/**
 * Created by Connor on 2017.04.26..
 */
public class CreditCardReservationApp {

  public static void main(String[] args) {
    ArrayList<CreditCardReservation> creditCards = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      CreditCardReservation creditCard = new CreditCardReservation(i);
      creditCards.add(creditCard);
    }

    for (CreditCardReservation creditCard : creditCards) {
      System.out.println(creditCard);
    }
  }
}
