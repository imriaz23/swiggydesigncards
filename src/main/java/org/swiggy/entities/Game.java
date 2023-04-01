package org.swiggy.entities;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
  private final int initialNumberOfPlayers;
  private final Queue<Player> players;
  private final Deck deck;
  private final boolean isGameCompleted;

  public Game(int initialNumberOfPlayers) {
    this.initialNumberOfPlayers = initialNumberOfPlayers;
    this.isGameCompleted = false;
    this.players = new LinkedList<>();
    this.deck = new Deck();
  }

  public void addPlayer(List<Player> players) {
    this.players.addAll(players);
  }

  public boolean isGameCompleted() {
    return isGameCompleted;
  }

  public Deck getDeck() {
    return deck;
  }

  public Queue<Player> getPlayers() {
    return players;
  }
}
