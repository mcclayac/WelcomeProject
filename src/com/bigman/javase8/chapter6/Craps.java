package com.bigman.javase8.chapter6;

/**
 * Created by amcclay on 1/2/16.
 */

import java.security.SecureRandom;

public class Craps {

    private enum Status { CONTINUE, WON, LOST};

    private final static SecureRandom random = new SecureRandom();

    // constants that represent common rolls of the dic
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;



    public static void main (String[] args)  {

        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice)
        {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE; // game is not over
                myPoint = sumOfDice; // remember the point
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        // while game is not complete
        while (gameStatus == Status.CONTINUE) { // not WON or LOST {
            sumOfDice = rollDice(); // roll dice again
            // determine game status
            if (sumOfDice == myPoint) // win by making point
                gameStatus = Status.WON;
            else
                if (sumOfDice == SEVEN) // lose by rolling 7 before point
                    gameStatus = Status.LOST;
        }
        if (gameStatus == Status.WON)
            System.out.println("Player wins");
        else
            System.out.println("Player loses");
    }


    static int rollDice() {

        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);
        int  sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n",
                die1, die2, sum);
        return sum;
    }

}
