package org.academiadecodigo.bootcamp54.guessanumber;

/**
 * Created by codecadet on 25/09/2020.
 */
public class Generator {

    // Declaring Properties

    // private because (players shouldn't?)
    // static for one game per instance of programs
    private Rules rules;


    // Declaring the new Constructor with a game for the reference in method generate()
    public Generator(Rules rules) {
        this.rules = rules;
    }

    // Declaring the methods
    ////////////////////////

    // Generate
    public int generate() {
        return (int) Math.floor((Math.random() * rules.maximum) + rules.minimum);
    }
}
