import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int id;
    private Map<Course, Double> courseGrades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courseGrades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void enrollInCourse(Course course) {
        if (!courseGrades.containsKey(course)) {
            courseGrades.put(course, null);
        }
    }

    public void assignGrade(Course course, double grade) {
        if (courseGrades.containsKey(course)) {
            courseGrades.put(course, grade);
        }
    }

    public Double getGradeForCourse(Course course) {
        return courseGrades.getOrDefault(course, null);
    }

    public Map<Course, Double> getCourseGrades() {
        return courseGrades;
    }
}
