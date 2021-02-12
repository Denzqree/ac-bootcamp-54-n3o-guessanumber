package org.academiadecodigo.bootcamp54.guessanumber;

/**
 * Created by codecadet on 25/09/2020.
 */
public class Main {

    public static void main(String[] args) {


        // DO NOT DEFINE THOSE VARIABLES BELOW!

        boolean result = false;

        // DEFINE HERE THE GAME VARIABLES !!!!!
        // - RULES
        // -- Range of guesses
        int minimum = 1;
        int maximum = 20;
        // -- Number of rounds
        int numberOfRounds = 20;

        // - Players list
        String[] playersNames = new String[]{"Jonas", "Nuno", "Sofia", "Raquel", "Renata", "Jessica", "Miguel", "Daniel", "Carlos", "Robin"};
        ///////////////////////////////////////

        // INSTANCING A GAME !!!!!!!!!!!!!!!!!!
        //

        Rules rules = new Rules(minimum, maximum, numberOfRounds);

        Generator generator = new Generator(rules);

        Players players = new Players(generator, rules, playersNames);

        Game gameOne = new Game(players, rules, generator);

        System.out.println("--------- GAME ON ! ---------");
        gameOne.start();
        System.out.println("--------- GAME ENDED ---------");

        ///////////////////////////////////////

    }
}
