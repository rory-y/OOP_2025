package oop.labor02;

import oop.labor02.bank.BankAccount;
import oop.labor02.Rectangle.Rectangle;
import oop.labor02.DateUtil.DateUtil;
import oop.labor02.MyDate.MyDate;
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
        double total_area = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Rectangle " + i + ":");
            System.out.println("\tlength: " + rectangles[i].getWidth());
            System.out.println("\twidth: " + rectangles[i].getLength());
            System.out.println("\tarea: " + rectangles[i].area());
            System.out.println("\tperimeter: " + rectangles[i].perimeter());
            total_area += rectangles[i].area();
        }
        System.out.println("total area: " + total_area);

        // Exercise 3
        // DateUtil checks
        System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 31) == true);
        // MyDate checks
        MyDate date1 = new MyDate(2000, 6,12);
        System.out.println("Year: " + date1.getYear());
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Day: " + date1.getDay());
        System.out.println(date1.toString());
    }
}