package org.swiggy;

import java.util.List;
import org.swiggy.entities.Card;
import org.swiggy.entities.Deck;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    Deck deck = new Deck();
    deck.showDeckOfCards();
    deck.shuffleTheDeck();
    deck.showDeckOfCards();
  }
}