package oop.labor06.training;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.foreign.MemorySegment.NULL;

public class Training {
    private Course course;
    private MyDate startDate;
    private MyDate endDate;
    private double pricePerStudent;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    // constructors
    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course; // or `new Course("description", [int]numHours, "name");`
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

    public Training(String description, String name, int numHours, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = new Course(description, numHours, name);
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

    public boolean enroll(Student student){
        for(Student student1 : enrolledStudents){
            if(student1.equals(student)) {
                // failed to enroll student
                return false;
                }
            }
        enrolledStudents.add(student);
        // student has been enrolled successfully
        return true;
    }

    public Student findStudentByID(String ID){
        for(Student student : enrolledStudents){
            if(student.getID().equals(ID)){
                return student;
            }
        }
        return null;
    }

    public Course getCourse(){
        return course;
    }

    public int numInrolled(){
        return enrolledStudents.size();
    }

    // write the enrolled students into a file
    public void printToFile(String outpuFilePath){
        // create an output file at the given path, if it doesn't already exist
        // using the `String.format()` method to generate the file name
        String outputFileName = String.format("%s/%s_%s_%s.txt",outpuFilePath,course.getName(),startDate,endDate);
        File file = new File(outputFileName);
        try{
            if(file.createNewFile()){
                System.err.println("Output file successfully created: " + outputFileName + "\n");
                // put the contents of the `enrolledStudents` ArrayList into the file
                // overwriting everything in the file at each call of the function
                try{
                    FileWriter fileWriter = new FileWriter(outputFileName);
                    for(Student student2 : enrolledStudents){
                        fileWriter.write(student2.toString()); // idk why this needs `.toString()` to be written out explicitly
                        // since this `toString()` method already has a `\n` at the end, we don't need that here as well
                    }
                    fileWriter.close();
                }
                catch(IOException ex){
                    System.err.println("An error occurred in the file: " + ex.getMessage());
                }
            }
            else {
                System.err.println("Output file `" + outputFileName + "` already exists!\n");
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    // setters
    public void unEnroll(Student student){
        enrolledStudents.remove(student);
    }

    //toString
    @Override
    public String toString() {
        return "Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pricePerStudent=" + pricePerStudent +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }
}
