package com.bigman.javase8.chapter7;

/**
 * Created by amcclay on 1/3/16.
 */
public class SumArray {



    public static void main(String[] args) {


        int [] intarray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        for (int i = 0; i < intarray.length; i++) {

            total += intarray[i];
        }

        System.out.printf("Total of array elements: %d%n", total);

    }
}
