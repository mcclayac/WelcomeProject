package com.bigman.javase8.chapter3;

/**
 * Created by amcclay on 1/1/16.
 */

import java.util.Scanner;

public class AccountTest {



    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String accName;
        Account myAccount1 = new Account("Tony", 0);
        Account myAccount2 = new Account("Tyanne", 32.12);
        double depositAmount = 0.0;


        System.out.printf("Initial Account 1 Name %s%n%n  InitialBalance %4.2f%n",
                myAccount1.getName() , myAccount1.getBalance());
        System.out.printf("Initial Account 2 Name %s%n%n  Initial Balance %4.2f%n",
                myAccount2.getName(), myAccount2.getBalance());


        System.out.println("Pleass Enter an account name 1");
        accName = input.nextLine();
        myAccount1.setName(accName);

        System.out.println("Pleass Enter an account name 2");
        accName = input.nextLine();
        myAccount2.setName(accName);

        System.out.print("Enter deposit amount for account1: "); // prompt
        depositAmount = input.nextDouble();
        myAccount1.deposit(depositAmount);

        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble();
        myAccount2.deposit(depositAmount);





        System.out.print("New account base on myAccount 1 ");
        System.out.println(myAccount1.toString());

        System.out.print("New account base on myAccount 2 ");
        System.out.println(myAccount2.toString());




    }
}
