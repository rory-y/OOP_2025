package oop.labor02;

import oop.labor02.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("BT0001");
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
        account1.deposit(500);
        System.out.println(account1.getBalance());
        account1.deposit(-400);
        System.out.println(account1.getBalance());

        if(account1.withdraw(400)) {
            System.out.println("Successful withdraw!\n New balance: " + account1.getBalance());
        }
        else {
            System.out.println("Unsuccessful withdraw!\n New balance: " + account1.getBalance());
        }
        if(account1.withdraw(300)) {
            System.out.println("Successful withdraw!\n New balance: " + account1.getBalance());
        }
        else {
            System.out.println("Unsuccessful withdraw!\n New balance: " + account1.getBalance());
        }
    }
}