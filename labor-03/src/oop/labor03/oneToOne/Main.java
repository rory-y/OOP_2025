package oop.labor03.oneToOne;
import oop.labor03.oneToOne.BankAccount;
import oop.labor03.oneToOne.Customer;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("John", "BLACK");
        Customer customer2 = new Customer("Bill", "PINK");

        //BankAccount account1 = new BankAccount("AN001");
        // the bank account is now only accessible through John
        customer1.setAccount(new BankAccount ("AN001"));
        customer1.getAccount().deposit(500);

        // Bill gets John's account
        customer2.setAccount(customer1.getAccount());

        customer1.getAccount().withdraw(200);

        System.out.println(customer2);
        System.out.println(customer1);
    }
}
