public class Main {
    public static void main(String[] args) {
        // Create a Course
        Course javaCourse = new Course("CS101", "Intro to Java", 3);

        // Create Students
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        // Add Course to Course Management
        CourseManagement.addCourse("CS101", "Intro to Java", 3);

        // Enroll Students in Course
        if (CourseManagement.enrollStudentInCourse(student1, javaCourse)) {
            System.out.println(student1.getName() + " enrolled in " + javaCourse.getCourseName());
        }

        if (CourseManagement.enrollStudentInCourse(student2, javaCourse)) {
            System.out.println(student2.getName() + " enrolled in " + javaCourse.getCourseName());
        }

        // Assign Grades
        CourseManagement.assignGradeToStudent(student1, javaCourse, 85);
        CourseManagement.assignGradeToStudent(student2, javaCourse, 90);

        // Calculate Overall Grade for Students
        System.out.println(student1.getName() + "'s overall grade: " + CourseManagement.calculateOverallGrade(student1));
        System.out.println(student2.getName() + "'s overall grade: " + CourseManagement.calculateOverallGrade(student2));
    }
}
