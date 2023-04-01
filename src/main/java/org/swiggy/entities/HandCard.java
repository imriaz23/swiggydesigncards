package org.swiggy.entities;

import java.util.LinkedList;
import java.util.List;

public class HandCard {
  private final List<Card> cards = new LinkedList<>();

  public List<Card> getCards() {
    return cards;
  }

  public void addCards(Card card) {
    this.cards.add(card);
  }

  public void showHandCards() {
    for (Card card : cards) {
      card.showCard();
    }
  }

  public int containsCard(Card discardCard) {
    int index = -1;
    for (int i = 0; i < cards.size(); i++) {
      Card card = cards.get(i);
      if (card.getSuit().equals(discardCard.getSuit()) ||
          card.getFaceValue() == discardCard.getFaceValue()) {
        index = i;
        break;
      }
    }
    return index;

  }

  public Card removeCard(int index) {
    return cards.remove(index);
  }

  public boolean isEmpty() {
    return cards.isEmpty();
  }


}
