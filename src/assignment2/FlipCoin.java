package assignment2;

import java.util.Random;

public class FlipCoin {

    /**
     * 
     * @return a random 0 or 1
     * Value must be random
     */
    public int flipCoin() {
        //TODO Delete line below, and implement this method
        Random randomFlip = new Random();
        return randomFlip.nextInt(2);
    }
}
