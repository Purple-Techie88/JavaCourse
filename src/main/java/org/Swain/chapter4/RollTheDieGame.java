package org.swain.chapter4;

import java.util.Random;

public class RollTheDieGame {

    public static void main(String args[]) {
        //initialize what we know

        int maxRolls = 5;
        int maxSpaces = 20;
        Random randomNum = new Random();
        int currentSpace = 0;

        //roll the dice a set number of times
        for (int i = 1; i <= maxRolls; i++) {
            int die = randomNum.nextInt(6) + 1;
            currentSpace = currentSpace + die;
            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            //make a decision
            if (currentSpace == maxSpaces) {
                System.out.println("You re on space 20. Congrats you win!");
                break;
            } else if (currentSpace > maxSpaces) {
                System.out.print("Unfortunately, that takes you past " + maxSpaces + " spaces. You lose!");
                break;
            } else if (i == maxRolls && currentSpace < maxSpaces) {
                System.out.println("You're currently on " + currentSpace + ".");
                System.out.println("Sadly, you didn't make it to the " + maxSpaces + "th space. You lose!");
            } else {
                int remainingSpaces = maxSpaces - currentSpace;
                System.out.println("You are currently on " + currentSpace + " and have "
                        + remainingSpaces + " more to go.");
            }
        }
    }

}
