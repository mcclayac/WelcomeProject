package com.bigman.javase8.chapter6;

/**
 * Created by amcclay on 1/2/16.
 */



import java.security.SecureRandom;

public class RollDie {



    public static void main( String[] args) {


        SecureRandom random = new SecureRandom();

        int frequency1 = 0; // count of 1s rolled
        int frequency2 = 0; // count of 2s rolled
        int frequency3 = 0; // count of 3s rolled
        int frequency4 = 0; // count of 4s rolled
        int frequency5 = 0; // count of 5s rolled
        int frequency6 = 0; // count of 6s rolled

        for (int i = 1; i < 6000000; i++) {


            int face = 1 + random.nextInt(6); // number from 1 to 6

            // use face value 1-6 to determine which counter to increment
            switch (face) {
                case 1:
                    ++frequency1; // increment the 1s counter
                    break;
                case 2:
                    ++frequency2; // increment the 2s counter
                    break;
                case 3:
                    ++frequency3; // increment the 3s counter
                    break;
                case 4:
                    ++frequency4; // increment the 4s counter
                    break;
                case 5:
                    ++frequency5; // increment the 5s counter
                    break;
                case 6:
                    ++frequency6; // increment the 6s counter
                    break;
            }  // end-switch
        }  // end - for

        System.out.println("Face\tFrequency"); // output headers
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                frequency1, frequency2, frequency3, frequency4,
                frequency5, frequency6);




    }
}
