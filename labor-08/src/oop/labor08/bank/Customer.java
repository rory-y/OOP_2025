package oop.labor08.bank;
import java.util.ArrayList;

public class Customer {

    private final String firstName;
    private String lastName;
    // a final ArrayList means that it can only be created once
    private final ArrayList<BankAccount> accounts;
    // new attributes for identifying customer instances
    private static int numCustomers; // counts how many customers have been created
    private final int id; // a unic identifier fore each customer instance


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
        // new stuff
        this.id = numCustomers++;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumAccount() {
        return accounts.size();
    }

    public void closeAccount(String account) {
        for (BankAccount a : accounts) {
            if(a.getAccountNumber().equals(account)) {
                accounts.remove(a);
                break;
            }
        }
    }

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    @Override
    public String toString() {
        return id + ": " +firstName + " " + lastName + " accounts:" + accounts;
    }
}