package oop.labor04.lab_4_2;

import java.util.ArrayList;

public class Customer {
    private final String firstName;
    private String lastName;
    private BankAccount account;

    // an array for all the accounts
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private String accountNumber;

    // constructor
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastname(){
        return lastName;
    }
    public BankAccount getAccount(int accountNumber){
        if(accounts[accountNumber] != null){
            return accounts[accountNumber];
        }
        return null;
    }
    public int getNumAccounts(){
        return numAccounts;
    }

    // setters
    public void setLastname(String lastName){
        this.lastName = lastName;
    }

    public void addAccount(BankAccount account){
        if(numAccounts < MAX_ACCOUNTS){
            this.accounts[numAccounts] = account;
            numAccounts++;
        }
    }
    public void closeAccount(int accountNumber){
        if(this.accounts[accountNumber] != null){
            for(int i = numAccounts; i < numAccounts - 1; i++) {
                accounts[i] = accounts[i +1];
            }
            numAccounts--;
            accounts[numAccounts] = null;
        }
        else{
            System.out.println("Account number " + numAccounts + " does not exist\n");
        }
    }

    /*@Override
    public String toString(){
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\naccount: " + account;
    }*/
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(firstName).append(' ').append(lastName).append(" accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append("\t").append(accounts[i]).append("\n");
        }
        return result.toString();
    }
}
