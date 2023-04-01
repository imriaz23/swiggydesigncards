package org.swiggy.entities;

import java.util.Collections;
import java.util.HashSet;

public class HandCard {
  HashSet<Card> cards = new HashSet<>();

  public HashSet<Card> getCards() {
    return (HashSet<Card>) Collections.unmodifiableSet(cards);
  }

  public void addCards(Card card) {
    this.cards.add(card);
  }
}
