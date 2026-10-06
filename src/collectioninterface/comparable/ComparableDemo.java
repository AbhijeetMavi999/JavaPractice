package collectioninterface.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "John Cena", "Btech", 14900.33));
        studentList.add(new Student(104, "Roman Reigns", "MBA", 20482.59));
        studentList.add(new Student(108, "Tomm Hardy", "IIT", 20300.86));
        studentList.add(new Student(103, "Robert Pattinson", "BCA", 10900.12));
        studentList.add(new Student(111, "Dwane Johnson", "BBA", 10949.12));

        Collections.sort(studentList);
        System.out.println(studentList);
    }
}
