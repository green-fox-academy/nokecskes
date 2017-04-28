package twentyPlusOne;

import java.util.ArrayList;
import java.util.Collections;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by Connor on 2017.04.19..
 */
public class Deck {

  ArrayList<Card> deck;

  public Deck() {
    deck = new ArrayList<>();
//    fillDeck();
  }
/*
  public void fillDeck() {
    for (int i = 0; i < 52 ; i++) {
      Card card =

    }

  }*/

  public void shuffleDeck(){
    Collections.shuffle(deck);
  }

  public void pullFirst(){
    pull(0);
  }

  public void pullLast(){
    pull(deck.size() - 1);
  }

  public void pullRandom() {
    pull((int)(Math.random() * deck.size()));
  }

  public void pull(int index) {
    Card card = deck.get(index);
    deck.remove(index);
    System.out.println(card);
  }

}
