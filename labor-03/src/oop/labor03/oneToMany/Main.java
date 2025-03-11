package oop.labor03.oneToMany;

public class Main {
    public static void main(String[] args) {
        // creating two customers
        Customer customer1 = new Customer("Customer_1", "name_1");
        Customer customer2 = new Customer("Customer_2", "name_2");

        // adding 5 accounts to customer1
        customer1.addAccount(new BankAccount("CN001AN001"));
        customer1.addAccount(new BankAccount("CN001AN002"));
        customer1.addAccount(new BankAccount("CN001AN003"));
        customer1.addAccount(new BankAccount("CN001AN004"));
        customer1.addAccount(new BankAccount("CN001AN005"));
        // adding 3 accounts to customer2
        customer2.addAccount(new BankAccount("CN002AN001"));
        customer2.addAccount(new BankAccount("CN002AN002"));
        customer2.addAccount(new BankAccount("CN002AN003"));

        // print both customers and all of their accounts
        System.out.println(customer1);
        System.out.println(customer2);

        // depositing money
        customer1.getAccount(0).deposit(100);
        customer1.getAccount(1).deposit(200);
        customer1.getAccount(2).deposit(300);
        customer1.getAccount(3).deposit(400);
        customer1.getAccount(4).deposit(500);

        customer2.getAccount(0).deposit(900);
        customer2.getAccount(1).deposit(800);
        customer2.getAccount(2).deposit(700);

        // closing the first account of customer1
        customer1.closeAccount(customer1.getAccount(0),0);
        customer2.closeAccount(customer2.getAccount(2),2);

        // print all customers and accounts again
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
