# Course Enrollment and Grade Management System

This is a simple Java application to manage course enrollments, student registrations, and grade assignments at a university. It includes the following features:
- Enroll students in courses.
- Assign grades to students.
- Calculate overall grades based on individual course grades.

## Project Structure

- **Student.java** – Contains the logic related to student data, course enrollments, and grade assignments.
- **Course.java** – Manages course-related information such as course name, code, and maximum capacity.
- **CourseManagement.java** – Manages the enrollment of students in courses, assignment of grades, and calculates overall grades.
- **StudentTest.java** – JUnit test class to test `Student` class functionality.
- **CourseTest.java** – JUnit test class to test `Course` class functionality (optional).
- **TestCourseEnrollmentSystem.java** – Manual testing class to print results for visual verification (optional).

## How to Run the Project

### Prerequisites
1. JDK 8 or later
2. Maven or Gradle (optional if using JUnit for testing)

### Running the Program
1. Compile and run the `Main` class using your IDE or the command line:
   ```bash
   javac Main.java
   java Main
