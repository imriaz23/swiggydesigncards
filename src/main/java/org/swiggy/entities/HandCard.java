package org.swiggy.entities;

import java.util.HashSet;

public class HandCard {
  HashSet<Card> cards = new HashSet<>();

  public HashSet<Card> getCards() {
    return cards;
  }

  public void addCards(Card card) {
    this.cards.add(card);
  }
  public void showHandCards(){
    for(Card card : cards){
      card.showCard();
    }
  }
}
