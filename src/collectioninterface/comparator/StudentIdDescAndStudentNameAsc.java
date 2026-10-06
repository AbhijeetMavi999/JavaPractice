package collectioninterface.comparator;

import java.util.Comparator;

public class StudentIdDescAndStudentNameAsc implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // Primary: Id descending (note s2 vs s1, not s1 vs s2)
        int idComparison = Integer.compare(s2.getId(), s1.getId());

        if(idComparison != 0) return idComparison;

        // Secondary: name ascending (note s1 vs s2, not s2 vs s1)
        return s1.getName().compareTo(s2.getName());
    }
}
