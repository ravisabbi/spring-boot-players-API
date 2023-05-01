/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */
 package com.example.player;


 import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.RequestBody;
  import org.springframework.web.bind.annotation.PostMapping;
  import org.springframework.web.bind.annotation.PathVariable;
  import org.springframework.web.bind.annotation.PutMapping;
    import org.springframework.web.bind.annotation.DeleteMapping;
  import java.util.ArrayList;
  import com.example.player.Player;
  import com.example.player.PlayerService;

// Write your code here.
@RestController
public class PlayerController{
   PlayerService  playerService = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getAllPlayer(){
        return playerService.getAllPlayers();
    }

    @PostMapping("/players")
   public  Player addPlayer(@RequestBody Player player){
      return playerService.addPlayer(player);
    }

    @GetMapping("/players/{playerId}")
   public  Player getPlayer(@PathVariable("playerId")   int playerId){
      return playerService.getPlayer(playerId);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@RequestBody Player player,@PathVariable("playerId") int playerId){
      return playerService.updatePlayer(player,playerId);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId){
       playerService.deletePlayer(playerId);
    }


}