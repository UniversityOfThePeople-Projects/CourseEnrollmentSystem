import java.util.ArrayList;
import java.util.List;

public class CourseManagement {
    private static List<Course> courses = new ArrayList<>();

    // Method to add a new course
    public static void addCourse(String courseCode, String courseName, int maxCapacity) {
        Course course = new Course(courseCode, courseName, maxCapacity);
        courses.add(course);
    }

    // Method to enroll a student in a course
    public static boolean enrollStudentInCourse(Student student, Course course) {
        return course.enrollStudent(student);
    }

    // Method to assign grade to a student for a specific course
    public static void assignGradeToStudent(Student student, Course course, double grade) {
        student.assignGrade(course, grade);
    }

    // Method to calculate the overall grade of a student based on enrolled courses
    public static double calculateOverallGrade(Student student) {
        double totalGrades = 0;
        int count = 0;
        for (Course course : student.getEnrolledCourses()) {
            double grade = student.getGrade(course);
            if (grade >= 0) {
                totalGrades += grade;
                count++;
            }
        }
        return count > 0 ? totalGrades / count : 0;
    }
}
