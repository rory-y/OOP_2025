package oop.labor03.oneToOne;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    // constructor
    public Customer(String fisrtName,String lastName){
        this.firstName = fisrtName;
        this.lastName = lastName;
    }

    // getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastname(){
        return lastName;
    }
    public BankAccount getAccount(){
        return account;
    }

    public void setLastname(String lastName){
        this.lastName = lastName;
    }

    public void setAccount(BankAccount account){
        this.account = account;
    }
    public void closeAccount(BankAccount account){
        this.account = null;
    }

    @Override
    public String toString(){
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\naccount: " + account;
    }
}
