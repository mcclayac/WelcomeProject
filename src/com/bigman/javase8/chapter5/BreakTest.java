package com.bigman.javase8.chapter5;

/**
 * Created by amcclay on 1/2/16.
 */
public class BreakTest {


    public static void main (String[] args) {



        for (int i = 0; i < 10; i++) {


            if (i == 5)
                break;

            System.out.println("Break Test count : " + i);

        }

    }

}
