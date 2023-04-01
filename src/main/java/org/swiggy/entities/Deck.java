package org.swiggy.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private List<Card> cardDeck;

  public Deck() {
    this.cardDeck = new ArrayList<>();
    for (int faceValue = 1; faceValue <= 13; faceValue++) {
      for (Suit suit : Suit.values()) {
        cardDeck.add(new Card(faceValue, suit));
      }
    }
  }

  public List<Card> getCardDeck() {
    return Collections.unmodifiableList(cardDeck);
  }

  public void shuffleTheDeck(){

  }
}
