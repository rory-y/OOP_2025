package oop.labor04.lab_4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFilePrintItsLineNumbered("input_files/labor_04/lab_4_1_input.txt");
        ArrayList<Person> persons = readFromCSVFile("input_files/labor_04/lab_4_1_input.csv");
        for(Person p : persons){
            System.out.println(p);
        }
    }

    public static void readFilePrintItsLineNumbered( String fileName ) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
        //read and process the lines
            int i = 1;
            // read until the end of file
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(i + " " + line);
                i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Person> readFromCSVFile(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                // trim: eliminates leading and trailing spaces
                String firstName = items[0].trim(); // firstName
                String lastName = items[1].trim(); // lastName
                // Convert String → int: Integer.parseInt( String)
                int birthYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birthYear));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }

}
