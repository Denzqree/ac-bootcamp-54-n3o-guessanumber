package org.academiadecodigo.bootcamp54.guessanumber;

/**
 * Created by codecadet on 26/09/2020.
 */
public class Players {

    private int numberOfPlayers;
    private Scores scores;
    private Player[] players;
    private String[] playersNames;
    private int playersIndex;
    private Generator generator;
    private Rules rules;

    public Players(Generator generator, Rules rules, String[] playersNames) {
        this.scores = new Scores(rules);
        this.rules = rules;
        this.generator = generator;
        this.playersIndex = 0;
        this.playersNames = playersNames;
        this.players = new Player[playersNames.length];
        this.addPlayers(playersNames);
    }

    public Player addPlayer(String playerName) {

        if (playersIndex <= players.length - 1) {
            players[playersIndex] = new Player(generator, playersIndex);
            players[playersIndex].setName(playerName);
        }
        return players[playersIndex];
    }

    public Player[] addPlayers(String[] playersNames) {
        for (String playerName : playersNames) {
            players[playersIndex] = addPlayer(playerName);
            playersIndex++;
        }

        return players;
    }

    public Scores getScores() {
        return scores;
    }

    public void score(Player player){
        scores.score(player);
    }

    public Player getPlayer(Player player) {
        return players[player.getIndexOf()];
    }

    public int getPlayersIndex() {
        return playersIndex;
    }

    public Player[] getPlayers() {
        return players;
    }
}
