package com.bigman.javase8.chapter6;

/**
 * Created by amcclay on 1/3/16.
 */
public class MethodOverload {


    public static void main(String[] args) {


        int intValue = 7;
        double doubleValue = 7.5;


        int intReturnValue =
                square(intValue);
        double doubleReturnValue =
                square(doubleValue);

        System.out.printf("Square of integer 7 is %d%n", intReturnValue);
        System.out.printf("Square of double 7.5 is %f%n", doubleReturnValue);

    }

    private static double square(double doubleValue) {
        System.out.printf("%nCalled square with double argument: %f%n",
                doubleValue);
        return doubleValue * doubleValue;
    }

    private static int square(int intValue) {
        System.out.printf("%nCalled square with int argument: %d%n",
                intValue);
        return intValue * intValue;
    }


}
