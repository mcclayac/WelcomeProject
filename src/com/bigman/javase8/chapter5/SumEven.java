package com.bigman.javase8.chapter5;

/**
 * Created by amcclay on 1/2/16.
 */
public class SumEven {

    public static void main(String[] args){


        int total = 0;
        for (int i = 0; i <=20; i += 2){

            total += i;
            System.out.printf(" running total = %d%n", total);

        }

        System.out.printf(" sum total = %d%n%n", total);
    }
}
