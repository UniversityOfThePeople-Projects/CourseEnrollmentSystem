**Course Enrollment and Grade Management System**

This is a simple Java application to manage course enrollments, student registrations, and grade assignments at a university. It includes the following features:

Enroll students in courses.
Assign grades to students.
Calculate overall grades based on individual course grades.
View enrolled courses and grades for each student.
Project Structure

Student.java – Contains the logic related to student data, course enrollments, and grade assignments.
Course.java – Manages course-related information such as course name, code, and maximum capacity.
CourseManagement.java – Manages the enrollment of students in courses, assignment of grades, and calculates overall grades.
StudentTest.java – JUnit test class to test the Student class functionality (optional).
CourseTest.java – JUnit test class to test the Course class functionality (optional).
TestCourseEnrollmentSystem.java – Manual testing class to print results for visual verification (optional).
Main.java – Entry point for the user interface and interaction. The program runs in a console and allows administrators to interact with the system.
Features

Add Courses: Administrators can add new courses, providing a course code, name, and capacity.
Enroll Students: Administrators can enroll students in available courses by selecting a course and assigning a student.
Assign Grades: Administrators can assign grades to students for enrolled courses.
Calculate Overall Grade: Administrators can calculate a student's overall grade based on enrolled courses and their respective grades.
View Enrolled Courses and Grades: Administrators can view the list of courses a student is enrolled in along with their grades.
How to Run the Project

**Prerequisites**
JDK 8 or later
Maven or Gradle (optional for running JUnit tests)
Running the Program
Compile and run the Main class:
You can use your IDE (like IntelliJ IDEA or Eclipse) to compile and run the program, or use the command line.
Using Command Line:

Navigate to the directory where your Main.java file is located.
Compile the Java file:
javac Main.java
Run the compiled Java program:
java Main
Manual Testing:
You can test the program manually by following the interactive prompts displayed when running the Main.java file.
Optional Testing with JUnit

JUnit 5 is included for unit testing the core functionality of the Student and Course classes.
If you have Maven or Gradle set up, run the tests with the following command:
For Maven:

mvn test
For Gradle:

gradle test
Additional Notes

Error Handling: The system handles common errors such as course overcapacity, invalid inputs for grades, etc.
Extensibility: The application can be easily extended to support features like course removal, student removal, or advanced grade calculations.
Database Integration: Currently, the project operates on in-memory data structures. For a production system, a database integration can be added for persistent data storage.
GitHub Repository


**Conclusion**

This project demonstrates a simple system for managing course enrollments, grade assignments, and overall grade calculation in a university setting. It provides both manual and automated testing options and is built with best practices in mind.
