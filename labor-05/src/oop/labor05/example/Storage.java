package oop.labor05.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
    private ArrayList

    public Storage(String inputFileName) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(inputFileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" "); // the regex string passed to split is where the original sitring gets split
                // trim: eliminates leading and trailing spaces
                int id = Integer.parseInt(items[0].trim());
                // Convert String → double: Double.parseDouble( String)

            }
    }

//    public void addProductToStorage(Product input){
//        storage.add(input);
//    }
}
