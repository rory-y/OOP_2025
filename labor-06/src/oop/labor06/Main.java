package oop.labor06;

import oop.labor06.training.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Course> courses = readCourses("courses.txt");
        for(Course c : courses){
            System.out.println(c);
        }

    }

    public static ArrayList<Course> readCourses(String inputFileName){
            ArrayList<Course> courses = new ArrayList<>();
            try (Scanner scanner = new Scanner(new File(inputFileName))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.isEmpty()) {
                        continue;
                    }
                    // the regex string passed to split is where the original string gets split
                    String[] items = line.split(",");
                    // trim: eliminates leading and trailing spaces
                    String name = items[0].trim();
                    String description = items[1].trim();
                    int numHours = Integer.parseInt(items[2].trim());

                    courses.add(new Course(description, numHours, name));
                }
            }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
            return courses;
        }
}
