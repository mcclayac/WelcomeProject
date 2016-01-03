package com.bigman.javase8.chapter7;

/**
 * Created by amcclay on 1/3/16.
 */

import java.security.SecureRandom;


public class RollDie {

    public static void main (String[] args) {

        SecureRandom randomNumbers = new SecureRandom();

        int[] frequency = new int[7];

        for (int roll = 1; roll < 6000000; roll++)
            ++frequency[1 + randomNumbers.nextInt(6)];

        System.out.printf("%s%10s%n", "Face", "Frequency");

        // output each array element's value
        for (int face = 1; face < frequency.length; face++)
            System.out.printf("%4d%10d%n", face, frequency[face]);
    }
}
