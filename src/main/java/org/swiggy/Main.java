package org.swiggy;

import java.util.ArrayList;
import java.util.List;
import org.swiggy.entities.Player;
import org.swiggy.services.GameService;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    GameService gameService = new GameService();
    List<Player> players = new ArrayList<>();
    players.add(new Player("Riaz"));
    players.add(new Player("Quadri"));
    players.add(new Player("Virat"));
    players.add(new Player("Kohli"));
    int noOfPlayers = 4;
    gameService.initializeTheGame(noOfPlayers, players);
//    gameService.showPlayerCards();
    gameService.startTheGame();


//    Deck deck = new Deck();
//    deck.showDeckOfCards();
//    deck.shuffleTheDeck();
//    deck.showDeckOfCards();
//    Player player1 = new Player("Riaz");
//    Player player2 = new Player("Quadri");
//    while(!deck.isEmpty()){
//      player1.getHandCard().addCards(deck.drawCard());
//      if(!deck.isEmpty()){
//        player2.getHandCard().addCards(deck.drawCard());
//      }
//    }
//    System.out.println("Players 1 hand cards " + player1.getHandCard().getCards().size());
//    player1.getHandCard().showHandCards();
//    System.out.println("Players 2 hand cards " +  player2.getHandCard().getCards().size());
//    player2.getHandCard().showHandCards();

  }
}