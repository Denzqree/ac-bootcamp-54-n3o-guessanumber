package org.academiadecodigo.bootcamp54.guessanumber;

import java.sql.SQLOutput;

/**
 * Created by codecadet on 25/09/2020.
 */
public class Game {

    // Declaring Properties
    private Players playersInstance;
    private Rules rules;
    public Generator generator;
    private int numberToGuess;
    private Player winner;
    private int roundsCount;


    // Declaring the new Constructor
    public Game(Players players, Rules rules, Generator generator) {
        roundsCount = 1;
        this.rules = rules;
        this.playersInstance = players;
        this.generator = generator;
    }

    // Declaring the methods
    ////////////////////////

    // Start the game
    public void start() {

        for (int round = 1; round <= rules.numberOfRounds; round++) {
            numberToGuess = generator.generate();
            System.out.println("Round nº" + round + "...");
            Player roundWinner = playRound(round, playersInstance);
            if (roundWinner instanceof Player) {
                playersInstance.score(roundWinner);
                System.out.println(roundWinner.getName() + " won round nº" + round + " guessing the number " + numberToGuess);
                System.out.println(roundWinner.getName() + "'score is now : "+playersInstance.getScores().playerScore(roundWinner));
                System.out.println("-----------------------------------------------------");
            }
            if (roundsCount >= rules.numberOfRounds) {
                break;
            }
        }
        Player gameWinner = playersInstance.getScores().getWinner();
        if(gameWinner instanceof Player){
            System.out.println("-----------------------------------------------------");
            System.out.println("Player nº" + gameWinner.getIndexOf() + " \"" + gameWinner.getName() + "\" won the game !");
            System.out.println("He/she scored " + playersInstance.getScores().playerScore(gameWinner) + " in " + roundsCount + " rounds.");
            return;
        }
    }

    private Player playRound(int round, Players playersInstance) {
        roundsCount++;
        for (Player player : playersInstance.getPlayers()) {
            int playerGuess = player.guess();
            System.out.println(player.getName() + " guessed : " + playerGuess);
            if (playerGuess != numberToGuess) {
                continue;
            }
            return player;
        }
        System.out.println("Nobody won this round ! The number to guess was : " + numberToGuess);
        System.out.println("-----------------------------------------------------");
        return null;
    }

}
