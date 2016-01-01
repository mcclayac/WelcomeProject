package com.bigman.javase8.chapter3;

/**
 * Created by amcclay on 1/1/16.
 */

import java.util.Scanner;

public class AccountTest {



    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String accName;
        Account myAccount1 = new Account("Tony");
        Account myAccount2 = new Account("Tyanne");


        System.out.printf("Initial Account 1 Name %s%n%n", myAccount1.getName());
        System.out.printf("Initial Account 2 Name %s%n%n", myAccount2.getName());


        System.out.println("Pleass Enter an account name 1");
        accName = input.nextLine();
        myAccount1.setName(accName);

        System.out.println("Pleass Enter an account name 2");
        accName = input.nextLine();
        myAccount2.setName(accName);


        System.out.printf("New account base on myAccount 1 name %s%n%n",
                myAccount1.getName());

        System.out.printf("New account base on myAccount 2 name %s%n%n",
                myAccount2.getName());



    }
}
