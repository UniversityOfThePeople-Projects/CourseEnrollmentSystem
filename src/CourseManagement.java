import java.util.ArrayList;
import java.util.List;

public class CourseManagement {
    private static List<Course> courseList = new ArrayList<>();

    public static void addCourse(String code, String name, int capacity) {
        courseList.add(new Course(code, name, capacity));
        System.out.println("Course added.");
    }

    public static Course findCourse(String code) {
        for (Course c : courseList) {
            if (c.getCode().equalsIgnoreCase(code)) {
                return c;
            }
        }
        return null;
    }

    public static boolean enrollStudent(Student student, Course course) {
        return course.enrollStudent(student);
    }

    public static void assignGrade(Student student, Course course, double grade) {
        student.assignGrade(course, grade);
    }

    public static double calculateOverallGrade(Student student) {
        double total = 0;
        int count = 0;
        for (Double grade : student.getCourseGrades().values()) {
            if (grade != null) {
                total += grade;
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }

    public static void viewCoursesAndGrades(Student student) {
        System.out.println("Courses and Grades for " + student.getName() + ":");
        for (Course course : student.getCourseGrades().keySet()) {
            Double grade = student.getCourseGrades().get(course);
            System.out.println(course + " | Grade: " + (grade == null ? "Not Assigned" : grade));
        }
    }
}
