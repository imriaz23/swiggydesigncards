package org.swiggy.services;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.swiggy.entities.Card;
import org.swiggy.entities.Game;
import org.swiggy.entities.Player;

public class GameService {
  private Game game;
  private int numOfPlayers;
  private int initialHandCardSize = 5;


  public void startTheGame(){

  }
  public void initializeTheGame(int numOfPlayers,List<Player> playerList){
    this.numOfPlayers = numOfPlayers;
    game = new Game(numOfPlayers);
    addPlayersToGame(playerList);
    setInitialHandCards();
  }
  private void addPlayersToGame(List<Player> playerList){
    game.addPlayer(playerList);
  }
  private void setInitialHandCards(){
    for(Player player : game.getPlayers()){
      for(int i = 0; i < initialHandCardSize; i++){
        player.getHandCard().addCards(game.getDeck().drawCard());
      }
    }
  }
  public void showPlayerCards(){
    for(Player player : game.getPlayers()){
      System.out.println(player.getName() + " cards ");
      player.getHandCard().showHandCards();
    }
  }
}
