package org.academiadecodigo.bootcamp54.guessanumber;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class Scores {

    private final Rules rules;
    private LinkedHashMap<Player,Integer> scores;

    public Scores(Rules rules){
        this.rules = rules;
        this.scores = new LinkedHashMap<>();
    }

    public void score(Player player){
        if(!scores.containsKey(player)){
            scores.put(player, 0);
        }
        scores.replace(player,scores.get(player)+1);
    }

    public int playerScore(Player player){
        if(!(scores.get(player) instanceof Integer)){
            return 0;
        }
        return scores.get(player);
    }
    
    public Player getWinner(){
        Player winner = null;
        for (Player player: scores.keySet()) {
            if(!(winner instanceof Player) || scores.get(winner) < scores.get(player)){
                winner = player;
            }
        }
        return winner;
    }

}
