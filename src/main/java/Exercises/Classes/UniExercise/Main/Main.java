package Exercises.Classes.UniExercise.Main;

import Exercises.Classes.UniExercise.University.Course;
import Exercises.Classes.UniExercise.University.Enrollment;
import Exercises.Classes.UniExercise.University.Student;

public class Main {
    public static void main(String[] args) {
        Student jeff = new Student();
        jeff.name = "Jeff";
        jeff.studentId = 123;

        Course math1 = new Course();
        math1.courseId = 32123;
        math1.courseName = "Math1";

        Enrollment enrollment = new Enrollment();
        enrollment.course = math1;
        enrollment.student = jeff;

        System.out.println("Enrollment: " + enrollment.student + ": " + enrollment.course);
        System.out.println("Student: " + jeff.studentId + ": " + jeff.name);
        System.out.println("Course: " + math1.courseId + ": " + math1.courseName);

    }
}