package oop.labor06.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private final String name;
    private final String description;
    private final int numHours;

//     constructor
    public Course(String description, int numHours, String name) {
        this.description = description;
        this.numHours = numHours;
        this.name = name;
    }

    //getters

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumHours() {
        return numHours;
    }

    // toString

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numHours=" + numHours +
                '}';
    }
}
