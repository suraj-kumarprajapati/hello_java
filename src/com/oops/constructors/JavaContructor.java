package com.oops.constructors;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

class Account {
    String name;
    double balance;

    // unparametarized

    // parametarized contructor
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // copy constructor
    public Account(Account acc) {
        this(acc.name, acc.balance);
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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

public class JavaContructor {
    public static void main(String[] args) {
        Account acc1 = new Account("suraj", 10000000);
        System.out.println(acc1);

        Account acc2 = new Account(acc1);
        System.out.println(acc2);
    }
}
