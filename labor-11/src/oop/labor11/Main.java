package oop.labor11;
import oop.labor11.excercise1.MyDate.MyDate;
import oop.labor11.excercise1.fruit.SortingDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // excercise 1
            // try out the sorting
        SortingDemo demo = new SortingDemo("labor-11/fruits.txt");
        demo.sortAlphabetical();
        demo.printFruits();
        demo.sortAlphabeticalReverse();
        demo.printFruits();

        // excercise 2
            // generate a bunch of valid dates
        ArrayList<MyDate> dates = new ArrayList<>();
        Random random = new Random();
        while(dates.size() < 10){
            int year = 2025;
            int month = random.nextInt(12) + 1;
            int day = random.nextInt(31) + 1;

            dates.add(new MyDate(year, month, day));
        }
            // sort the 10 dates
        Collections.sort(dates);
            // printing the 10 valid dates
        System.out.println("in chronological order");
        for (MyDate d : dates){
            System.out.println(d);
        }

        dates.sort((o1, o2) -> {
                // this > < = that
                if (o2.getYear() == o1.getYear()) {
                    if (o2.getMonth() == o1.getMonth()) {
                        return o2.getDay() - o1.getDay();
                    }
                    return o2.getMonth() - o1.getMonth();
                }
                return o2.getYear() - o1.getYear();
        });
        // printing the 10 valid dates IN REVERSE ORDER
        System.out.println("in reverse chronological order");
        for (MyDate d : dates){
            System.out.println(d);
        }
    }
}
