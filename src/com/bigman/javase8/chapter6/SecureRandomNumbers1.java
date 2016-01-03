package com.bigman.javase8.chapter6;

/**
 * Created by amcclay on 1/2/16.
 */

import java.security.SecureRandom;


public class SecureRandomNumbers1 {


    public static void main (String[] args) {

        SecureRandom random = new SecureRandom();



        for (int i = 0; i<10; i++) {

            int randomnum = random.nextInt(10);

            System.out.printf("loop %d  radmon number: %d%n", i, randomnum);
        }

    }


}
