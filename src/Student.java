import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<Course> enrolledCourses;
    private List<Double> grades;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void addCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void assignGrade(Course course, double grade) {
        int index = enrolledCourses.indexOf(course);
        if (index >= 0) {
            grades.set(index, grade);
        } else {
            enrolledCourses.add(course);
            grades.add(grade);
        }
    }

    public double getGrade(Course course) {
        int index = enrolledCourses.indexOf(course);
        return index >= 0 ? grades.get(index) : -1; // -1 if course not found
    }
}
