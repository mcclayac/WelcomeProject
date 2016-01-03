package com.bigman.javase8.chapter6;

/**
 * Created by amcclay on 1/2/16.
 */

import java.security.SecureRandom;


public class RandomIntegers {



    public static void main(String[] args) {


        SecureRandom random = new SecureRandom();

        for( int i = 1; i <= 100; i++) {


            int face = 1 + random.nextInt(6);

            System.out.printf(" %d   ", face);

            if (i % 5 == 0) {
                System.out.println("");
            }
        }
    }
}
