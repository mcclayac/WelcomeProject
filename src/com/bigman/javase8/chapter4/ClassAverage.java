package com.bigman.javase8.chapter4;

/**
 * Created by amcclay on 1/1/16.
 */

import java.util.Scanner;

public class ClassAverage {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        // prompt for input and read grade from user
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        while (grade != -1) {

            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();

        }


        if (gradeCounter == 0) {
            System.out.println("No grades were entered");
        } else {
            double average = (double) total / gradeCounter;


            System.out.printf("The Totoal of all the grades = %d%n", total);
            System.out.printf("The Class Average is : %4.2f%n", average);

        }
    }
}
