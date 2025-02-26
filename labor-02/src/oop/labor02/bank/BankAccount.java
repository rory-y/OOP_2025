package oop.labor02.bank;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) { // this is a method
        this.accountNumber = accountNumber;
        this.balance = 0; // this is not necessary
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositValue) {
        if (depositValue > 0){
            balance += depositValue;
        }
        else {
            System.out.println("Only positive values are accepted!");
        }
    }

    public boolean withdraw(double withdrawValue) {
        if(withdrawValue < balance){
            balance -= withdrawValue;
            return true;
        }
        else {
//            System.out.println("Unsuccessful withdraw!");
            return false;
        }
    }
}
