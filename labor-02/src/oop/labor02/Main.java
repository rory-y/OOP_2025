package oop.labor02;

import oop.labor02.bank.BankAccount;
import oop.labor02.Rectangle.Rectangle;
import java.util.Random;

public class Main {
    // Exercise 1.
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

        // Exercise 2.
        Rectangle[] rectangles = new Rectangle[ 10 ];

        // use a random generator
        Random rand = new Random();
        //generate positive random numbers less than a bound
        for(int i = 0; i < 10; i++){
            double length = 1 + rand.nextDouble(10);
            double width = 1 + rand.nextDouble(10) ;
            rectangles[ i ] = new Rectangle(length, width);
        }
        // print the rectangle to the console
        for(int i = 0; i < 10; i++){
            System.out.println("Rectangle " + i + ":");
            System.out.println("\tlength: " + rectangles[i].getWidth());
            System.out.println("\twidth: " + rectangles[i].getLength());
            System.out.println("\tarea: " + rectangles[i].area());
            System.out.println("\tperimeter: " + rectangles[i].perimeter());
        }

    }
}