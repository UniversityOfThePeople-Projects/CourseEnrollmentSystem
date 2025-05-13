Course Enrollment and Grade Management System

This is a simple Java application to manage course enrollments, student registrations, and grade assignments at a university.

Features

Enroll students in courses
Assign grades to students
Calculate overall grades based on individual course grades
View enrolled courses and grades for each student
Project Structure

Student.java – Contains the logic related to student data, course enrollments, and grade assignments
Course.java – Manages course-related information such as course name, code, and maximum capacity
CourseManagement.java – Handles enrollment, grade assignment, and grade calculation
StudentTest.java – JUnit test class for Student functionality (optional)
CourseTest.java – JUnit test class for Course functionality (optional)
TestCourseEnrollmentSystem.java – Manual testing class for visual verification (optional)
Main.java – Entry point for the console-based user interface
How to Run the Project

Prerequisites
JDK 8 or later
Maven or Gradle (optional, for running JUnit tests)
Running the Program
You can use your IDE (like IntelliJ IDEA or Eclipse) or the command line.

Using Command Line:

# Navigate to the directory with Main.java
javac Main.java
java Main
Manual Testing
Run Main.java and follow the interactive console prompts to test the system manually.

Optional Testing with JUnit

JUnit 5 is used for unit testing.

If using Maven:
mvn test
If using Gradle:
gradle test
Additional Notes

Error Handling: Handles errors like course overcapacity and invalid grade inputs
Extensibility: Easy to extend for features like course/student removal or advanced grading
Database Integration: Currently uses in-memory data; can be upgraded to use a database for persistence
Conclusion

This project demonstrates a basic system for managing course enrollments, assigning grades, and calculating overall student performance. It supports both manual interaction and automated testing, and it follows clean, maintainable code practices.
