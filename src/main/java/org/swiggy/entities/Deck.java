package org.swiggy.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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

  public List<Card> getCardDeck() {
    return Collections.unmodifiableList(cardDeck);
  }

  public void shuffleTheDeck() {
    Random random = new Random();
    for (int i = cardDeck.size() - 1; i >= 0; i--) {
      int randomInt = random.nextInt(0, i + 1);
      Card tempCard = cardDeck.get(randomInt);
      cardDeck.set(randomInt, cardDeck.get(i));
      cardDeck.set(i, tempCard);
    }
  }

  public void showDeckOfCards() {
    for (Card card : cardDeck) {
      card.showCard();
    }
  }

  public Card drawCard() {
    return cardDeck.remove(cardDeck.size() - 1);
  }

  public boolean isEmpty() {
    return cardDeck.isEmpty();
  }
}
