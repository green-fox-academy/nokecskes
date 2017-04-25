package creditCard;

import java.util.ArrayList;

/**
 * Created by Connor on 2017.04.25..
 */
public class CreditCardApp {

  public static void main(String[] args) {
    ArrayList<CreditCard> creditCards = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      CreditCard creditCard = new CreditCard(i);
      creditCards.add(creditCard);
    }

    for (CreditCard creditCard : creditCards) {
      System.out.println(creditCard);
    }
  }
}
