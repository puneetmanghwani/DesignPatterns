package DesignQuestions.SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    int min = 1;
    int max = 6;

    int count = 1;

    public Dice(int count){
        this.count = count;
    }

    public int roll(){
        int total = 0;
        int diceUsed = 0;

        while(diceUsed<this.count){
            total+= ThreadLocalRandom.current().nextInt(min, max+1);
            diceUsed++;
        }

        return total;
    }

}
