package com.bigman.javase8.chapter5;

/**
 * Created by amcclay on 1/2/16.
 */
public class ContinueTest {




    public static void main (String[] args) {



        for (int i = 0; i < 10; i++) {


            if (i == 5)
                continue;

            System.out.println("Continue Test count : " + i);

        }

    }
}
