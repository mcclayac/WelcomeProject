package com.bigman.javase8.chapter3;

/**
 * Created by amcclay on 1/1/16.
 */

import java.util.Scanner;

public class AccountTest {



    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String accName;
        Account myAccount = new Account();

        System.out.printf("Initial Account Name %s%n%n", myAccount.getName());


        System.out.println("Pleass Enter an account name");
        accName = input.nextLine();

        myAccount.setName(accName);

        System.out.printf("New account base on myAccount name %s%n%n", myAccount.getName());


    }
}
