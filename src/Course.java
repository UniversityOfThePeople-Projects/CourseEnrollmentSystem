import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private int maxCapacity;
    private List<Student> enrolledStudents;

    // Static variable to keep track of the total number of students enrolled across all courses
    private static int totalStudentsEnrolled = 0;

    // Constructor
    public Course(String courseCode, String courseName, int maxCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getters
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    // Static method to get the total number of enrolled students
    public static int getTotalStudentsEnrolled() {
        return totalStudentsEnrolled;
    }

    // Method to enroll a student in the course
    public boolean enrollStudent(Student student) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(student);
            totalStudentsEnrolled++;
            return true;
        }
        return false; // Course is full
    }
}
