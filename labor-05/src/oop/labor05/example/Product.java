package oop.labor05.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double buyPrice, sellPrice;
    private double percentage;
    private ArrayList<Product> products = new ArrayList<>();

    public Product(int id, String name, double buyPrice, double percentage) {
        this.id = id;
        this.name = name;
        this.buyPrice = buyPrice;
        this.percentage = percentage;
    }
    public Product(String inputFileName) {
//        this.buyPrice = buyPrice;
//        this.name = name;
//        this.id = id;
        try (Scanner scanner = new Scanner(new File(inputFileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" "); // the regex string passed to split is where the original sitring gets split
                // trim: eliminates leading and trailing spaces
                int id = Integer.parseInt(items[0].trim());
                String name = items[1].trim();
                // Convert String → double: Double.parseDouble( String)
                double buyPrice = Double.parseDouble(items[2].trim());
                double percentage = Double.parseDouble(items[3].trim());

                this.id = id;
                this.name = name;
                this.buyPrice = buyPrice;
                this.percentage = percentage;

                Product temp = new Product(id, name, buyPrice, percentage);
                products.add(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // getters
    public int getID(){
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    // setters
    public void priceMargin(double percentage){
        this.percentage = percentage;
        sellPrice += (buyPrice * percentage)/100;
    }

    // toString

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | " + "buy price: " + buyPrice + " | sell price: " + sellPrice + "\n";
    }
}
