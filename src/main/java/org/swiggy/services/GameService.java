package org.swiggy.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.swiggy.entities.Card;
import org.swiggy.entities.Deck;
import org.swiggy.entities.Player;

public class GameService {
  private final int initialHandCardSize = 5;
  private final Deck deck;
  private final Queue<Player> players;
  private Card discardCard;
  private int numOfPlayers;
  private boolean isGameCompleted;
  private boolean isDraw;

  public GameService() {
    this.players = new LinkedList<>();
    this.deck = new Deck();
    this.isGameCompleted = false;
    this.isDraw = false;
  }

  public void startTheGame() {
    while (!isGameCompleted() && !isDraw()) {
      Player currentPlayer = players.poll();
      System.out.print("Discard plies top card is : ");
      discardCard.showCard();
      System.out.println("It is " + currentPlayer.getName() + "'s turn");
      System.out.println("Player " + currentPlayer.getName() + " " + "has following cards at hand");
      showPlayerCards(currentPlayer);
      playsTheGame(currentPlayer);
      if (isDraw()) {
        System.out.println("*********** Draw ***********");
      } else if (isGameCompleted()) {
        System.out.println("*********** " + currentPlayer.getName() + " won the game. ***********");
      } else {
        players.add(currentPlayer);
      }

    }
  }

  private void playsTheGame(Player player) {
    if (deck.isEmpty() && !player.getHandCard().isEmpty()) {
      this.isDraw = true;
      return;
    }
    if (player.getHandCard().isEmpty()) {
      this.isGameCompleted = true;
      return;
    }
    int index = getIndexOfMatchedCard(player);
    if (index != -1) {
      this.discardCard = player.getHandCard().removeCard(index);
      System.out.print(player.getName() + " played ");
      discardCard.showCard();
    } else {
      player.getHandCard().addCards(deck.drawCard());
    }

  }

  private boolean isDraw() {
    return this.isDraw;
  }

  public void initializeTheGame(int numOfPlayers, List<Player> playerList) {
    this.numOfPlayers = numOfPlayers;
    addPlayersToGame(playerList);
    setInitialHandCards();
    initializeTheDiscardCard();
  }

  private void initializeTheDiscardCard() {
    this.discardCard = deck.drawCard();
  }

  private void addPlayersToGame(List<Player> playerList) {
    this.players.addAll(playerList);
  }

  private void setInitialHandCards() {
    for (Player player : this.players) {
      for (int i = 0; i < initialHandCardSize; i++) {
        player.getHandCard().addCards(deck.drawCard());
      }
    }
  }

  public void showPlayerCards() {
    for (Player player : players) {
      System.out.println(player.getName() + " cards ");
      player.getHandCard().showHandCards();
    }
  }

  public void showPlayerCards(Player player) {
    System.out.println(player.getName() + " cards ");
    player.getHandCard().showHandCards();
  }

  private boolean isGameCompleted() {
    return this.isGameCompleted;
  }


  private int getIndexOfMatchedCard(Player player) {
    int index = player.getHandCard().containsCard(this.discardCard);
    return index;
  }

}
