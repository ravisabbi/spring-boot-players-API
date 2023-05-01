// Write your code here
package com.example.player;

import java.util.ArrayList;


public interface PlayerRepository{
     
     
    ArrayList<Player> getAllPlayers();

    Player addPlayer(Player player);

    Player getPlayer(int PlayerId);

    Player updatePlayer(Player player,int PlayerId);

    void deletePlayer(int PlayerId);

    
    
    

    

}