import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("John Doe", 101); // Example student

        while (true) {
            System.out.println("\n=== Course Enrollment System ===");
            System.out.println("1. Add Course");
            System.out.println("2. Enroll Student");
            System.out.println("3. Assign Grade");
            System.out.println("4. Calculate Overall Grade");
            System.out.println("5. View Enrolled Courses and Grades");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Course Code: ");
                    String code = scanner.next();
                    System.out.print("Course Name: ");
                    String name = scanner.next();
                    System.out.print("Capacity: ");
                    int cap = scanner.nextInt();
                    CourseManagement.addCourse(code, name, cap);
                    break;
                case 2:
                    System.out.print("Course Code to enroll in: ");
                    String courseCode = scanner.next();
                    Course course = CourseManagement.findCourse(courseCode);
                    if (course != null) {
                        if (CourseManagement.enrollStudent(student, course)) {
                            System.out.println("Enrolled successfully.");
                        } else {
                            System.out.println("Enrollment failed (course full or already enrolled).");
                        }
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case 3:
                    System.out.print("Course Code: ");
                    courseCode = scanner.next();
                    course = CourseManagement.findCourse(courseCode);
                    if (course != null) {
                        System.out.print("Enter grade: ");
                        double grade = scanner.nextDouble();
                        CourseManagement.assignGrade(student, course, grade);
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case 4:
                    double overall = CourseManagement.calculateOverallGrade(student);
                    System.out.println("Overall Grade: " + overall);
                    break;
                case 5:
                    CourseManagement.viewCoursesAndGrades(student);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
