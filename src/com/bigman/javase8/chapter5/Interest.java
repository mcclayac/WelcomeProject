package com.bigman.javase8.chapter5;

/**
 * Created by amcclay on 1/2/16.
 */
public class Interest {


    public static void main(String[] args){

        double amount;
        double principal = 1000;  // initial amount before interest payments
        double rate = 0.05;      //  interest every year


        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 0; year <= 10 ; year++) {

            amount = principal * Math.pow(1.0 + rate, year);

            System.out.printf("%4d%,20.2f%n",
                    year, amount );
        }

    }
}
