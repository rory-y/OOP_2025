package oop.labor11.excercise1.fruit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingDemo {
    private final ArrayList<String> fruits = new ArrayList<>();

    // constructor
    public SortingDemo(String fileName){
        try(Scanner scanner = new Scanner(new File(fileName))){
            while(scanner.hasNext()){
                String word = scanner.next();
                if (word.isEmpty()){
                    continue;
                }
                fruits.add(word);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    // print all fruits.txt
    public void printFruits(){
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

    // sorting
    public void sortAlphabetical(){
        // this sorts alphabetically by default
        Collections.sort(fruits);
    }

    // reverse order
    public void sortAlphabeticalReverse(){
        // this sorts alphabetically then flips it around
        Collections.sort(fruits);
        // or
//        Collections.sort(fruits, Collections.reverseOrder());
//        fruits.sort(Collections.reverseOrder());
    }
}
