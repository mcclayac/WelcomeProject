package com.bigman.javase8.chapter6;

/**
 * Created by amcclay on 1/2/16.
 */

import java.util.Scanner;

public class MaximunFinder {



    public static void main (String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter three floating-point values separated by spaces: ");

        double value1 = input.nextDouble();
        double value2 = input.nextDouble();
        double value3 = input.nextDouble();

        double maximunValue = maximum(value1, value2, value3);

        System.out.println("Maximum is: " + maximunValue);

    }


    static public double maximum( double val1, double val2, double val3) {



        return Math.max(val1, Math.max(val2, val3));


//        double max = val1;
//
//        if ( val2 > val1)
//            max = val2;
//
//        if (val3 > val1)
//            max = val3;
//
//        return max;
    }
}
