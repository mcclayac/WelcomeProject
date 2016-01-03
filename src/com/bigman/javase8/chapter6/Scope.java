package com.bigman.javase8.chapter6;

/**
 * Created by amcclay on 1/3/16.
 */


public class Scope {


    private static int x = 1;


    public static void main (String[] args) {


        int x = 5;  //

        System.out.printf("local x in main is %d%n", x);

        useLocalVariables();
        useField();
        useLocalVariables();
        useField();

        System.out.printf("local x in main is %d%n", x);
    }

    private static void useField() {

        System.out.printf(
        "%nfield x on entering method useField is %d%n", x);

    }

    private static void useLocalVariables() {

        int x = 25;

        System.out.printf(
                "%nlocal x on entering method useLocalVariable is %d%n", x);

        x++;
        System.out.printf(
                "local x before exiting method useLocalVariable is %d%n", x);





    }




}
