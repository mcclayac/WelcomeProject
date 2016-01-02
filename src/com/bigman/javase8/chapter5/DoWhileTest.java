package com.bigman.javase8.chapter5;

/**
 * Created by amcclay on 1/2/16.
 */
public class DoWhileTest {

    public static void main (String[] args)  {


        int i = 1;

        do {

            System.out.printf("Count %5d%n", i);
            i++;
        } while ( i <= 10);
    }
}
