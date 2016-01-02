package com.bigman.javase8.chapter4;

/**
 * Created by amcclay on 1/1/16.
 */
public class StudentTest {


    public static void main(String[] args) {

        Student acoount1 = new Student("Tony McClay", 62.3);
        Student account2 = new Student("Tyanne McClay", 93.2);

        System.out.print("Account 1 information:");
        System.out.println(acoount1.toString());

        System.out.print("Account 2 information:");
        System.out.println(account2.toString());


    }
}
