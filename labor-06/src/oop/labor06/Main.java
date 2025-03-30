package oop.labor06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import oop.labor06.training.Course;
import oop.labor06.training.Student;
import oop.labor06.training.Training;

public class Main {
  public static void main(String[] args) {
// elso alpont
      ArrayList<Course> courses = readCourses("input_files/labor_06/courses.csv");
      for(Course c : courses){
          System.out.println(c);
      }
// masodik alpont
//    ArrayList<Student> students = readStudents("input_files/labor_06/students.csv");
//    for (Student c : students) {
//      System.out.println(c);
//    }
// harmodik alpont
//  - create trainings ArrayList and fill it up with trainings for every course in the `courses` ArrayList
    ArrayList<Training> trainings = new ArrayList<>();
    for(Course course : courses){

    }

  }

  public static ArrayList<Course> readCourses(String inputFileName) {
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
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return courses;
  }

  public static ArrayList<Student> readStudents(String inputFileName) {
    ArrayList<Student> students = new ArrayList<>();
    try (Scanner scanner = new Scanner(new File(inputFileName))) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        if (line.isEmpty()) {
          continue;
        }
        // the regex string passed to split is where the original string gets split
        String[] items = line.split(",");
        // trim: eliminates leading and trailing spaces
        String ID = items[0].trim();
        String firstName = items[1].trim();
        String lastName = items[2].trim();

        students.add(new Student(ID, lastName, firstName));
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return students;
  }
}
