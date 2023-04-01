package org.swiggy.entities;

import java.util.ArrayList;
import java.util.List;

public class Deck {
  private final List<Card> cardDeck;

  public Deck() {
    this.cardDeck = new ArrayList<>();
    for (int faceValue = 1; faceValue <= 13; faceValue++) {
      for (Suit suit : Suit.values()) {
        cardDeck.add(new Card(faceValue, suit));
      }
    }
  }
}
