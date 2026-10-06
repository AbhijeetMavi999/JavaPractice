package collectioninterface.comparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<collectioninterface.comparator.Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "John Cena", "Btech", 14900.33));
        studentList.add(new Student(104, "Roman Reigns", "MBA", 20482.59));
        studentList.add(new Student(108, "Tomm Hardy", "IIT", 20300.86));
        studentList.add(new Student(103, "Robert Pattinson", "BCA", 10900.12));
        studentList.add(new Student(111, "Dwane Johnson", "BBA", 10949.12));

        // Sorting by Name
//        studentList.sort(new SortingByName());
//        System.out.println(studentList);

        // Desc by Id and Asc by Name
        studentList.sort(new StudentIdDescAndStudentNameAsc());
        System.out.println(studentList);
    }
}
