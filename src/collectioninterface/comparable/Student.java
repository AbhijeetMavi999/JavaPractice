package collectioninterface.comparable;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String course;
    private double courseFees;

    public Student(int id, String name, String course, double courseFees) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.courseFees = courseFees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getCourseFees() {
        return courseFees;
    }

    public void setCourseFees(double courseFees) {
        this.courseFees = courseFees;
    }

    @Override
    public int compareTo(Student student) {
        if(this.courseFees < student.courseFees) return -1;
        else if(this.courseFees > student.courseFees) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", courseFees=" + courseFees +
                '}';
    }
}
