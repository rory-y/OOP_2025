package oop.labor05;

import oop.labor05.example.Product;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "alma", 5);
        product1.priceMargin(10);
        System.out.println(product1);

    }

}
