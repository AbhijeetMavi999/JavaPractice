package collectioninterface.comparator;

public class Student {
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
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", courseFees=" + courseFees +
                '}';
    }
}
