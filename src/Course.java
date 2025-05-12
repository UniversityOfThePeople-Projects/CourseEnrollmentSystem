import java.util.ArrayList;
import java.util.List;

public class Course {
    private String code;
    private String name;
    private int maxCapacity;
    private List<Student> enrolledStudents;
    private static int totalEnrolled = 0;

    public Course(String code, String name, int maxCapacity) {
        this.code = code;
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public boolean enrollStudent(Student student) {
        if (enrolledStudents.size() < maxCapacity && !enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this);
            totalEnrolled++;
            return true;
        }
        return false;
    }

    public static int getTotalEnrolled() {
        return totalEnrolled;
    }

    @Override
    public String toString() {
        return code + " - " + name;
    }
}
