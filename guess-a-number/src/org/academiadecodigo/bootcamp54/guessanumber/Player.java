package org.academiadecodigo.bootcamp54.guessanumber;

/**
 * Created by codecadet on 25/09/2020.
 */
public class Player {

    // Declaring properties
    private int indexOf;
    private String name;
    private Generator generator;

    // Declaring a new Constructor
    public Player(Generator generator, int indexOf) {
        this.generator = generator;
        this.indexOf = indexOf;
    }

    // Declaring methods
    ///////////////////////////////

    // Name GETTER
    public String getName() {
        return this.name;
    }

    // Name SETTER
    public Player setName(String name) {
        this.name = name;
        return this;
    }

    // Index GETTER
    public int getIndexOf() {
        return indexOf;
    }

    // Player guesses number
    public int guess() {
        return generator.generate();
    }
}
