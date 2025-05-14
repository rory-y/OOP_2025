package oop.labor08.bank;
public class BankAccount {
    private final String accountNumber;
    private double balance;
    // new stuff
    private static int numAccounts; // just like `numCustomers`
    public final static String PREFIX = "BT"; // this is shared by all instances and all classes; cannot be changes since it's `final`
    public final static int ACCOUNT_NUMBER_LENGTH = 5; // just as the one above

    private String generateAccountNumber(){
        int numOfZeros = ACCOUNT_NUMBER_LENGTH - PREFIX.length() - String.valueOf(numAccounts).length();
        return PREFIX + "0".repeat(numOfZeros) + numAccounts;
    }

    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        this.balance = 0;
        // new stuff
        ++numAccounts; // increment the number of accounts every time a new account is created

    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public boolean withdraw (double amount){
        if( amount> this.balance){
            return false;
        }
        if(amount <0){
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public void deposit(double amount){
        if(amount<0){
            return;
        }
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}