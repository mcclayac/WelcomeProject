package com.bigman.javase8.chapter7;

/**
 * Created by amcclay on 1/3/16.
 */
public class InitArray {

    public static void main(String[] args) {

        final int twosArrayLength = 10;
        int [] intArry = new int[10];
        int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
        int[] twosArray = new int[twosArrayLength];


        for (int i = 0; i < 10; i++) {
            twosArray[i] = 2 + 2 * i;
        }

        System.out.printf("%s%8s%n", "Index", "Value"); // column headings

        for (int i = 0 ; i < 10; i++) {

            System.out.printf("%5d%8d%8d%8d%n", i,  intArry[i], array[i],
                    twosArray[i]);
        }

    }
}
