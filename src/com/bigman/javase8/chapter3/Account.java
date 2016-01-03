package com.bigman.javase8.chapter3;

/**
 * Created by amcclay on 1/1/16.
 */
public class Account {
    private String name;
    private double balance = 0.0;


    public Account(String name, double balance) {

        this.name = name;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name= '" + name + '\'' +
                ", balance= " + balance +
                '}';
    }

    public boolean deposit(double amount) {

        if (amount > 0.0) {
            balance = balance + amount;
            return true;
        }
        return false;
    }

}
