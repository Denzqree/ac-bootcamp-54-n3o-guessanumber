package org.academiadecodigo.bootcamp54.guessanumber;

/**
 * Created by codecadet on 26/09/2020.
 */
public class Rules {

    // Declaring properties
    public int minimum;
    public int maximum;


    public int numberOfRounds;

    // Declaring the new Constructor
    public Rules(int minimum, int maximum, int numberOfRounds) {
        this.minimum = minimum;
        this.maximum = maximum;
        this.numberOfRounds = numberOfRounds;
    }

}
