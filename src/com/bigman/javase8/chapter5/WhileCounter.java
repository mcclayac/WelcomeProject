package com.bigman.javase8.chapter5;

/**
 * Created by amcclay on 1/2/16.
 */
public class WhileCounter {

    public static void main(String[] args) {

        int counter = 0;

        while (counter++ < 10 ) {

            System.out.printf("Count num : %d%n" , counter);

            //counter++;
        }
    }
}
