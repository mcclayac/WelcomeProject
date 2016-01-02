package com.bigman.javase8.chapter4;

/**
 * Created by amcclay on 1/1/16.
 */

import java.util.Scanner;

public class Analysis {


    public static void main(String[] args) {

        // Initializing variables
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while ( studentCounter <= 10 ) {

            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if ( result == 1 ) {
                passes++;
            } else {
                failures++;
            }

            studentCounter++;
        }  // end-while

        System.out.printf(" passes = %d   failures  = %d%n%n", passes, failures);

        if (passes > 8 ) {
            System.out.print("Bonus to Professor");
        }

    }
}
