import academy.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Student student = createTestStudent();
        Teacher teacher = createTestTeacher();
        CourseInstance courseInstance = createTestCourseInstance(teacher);

        courseInstance.enrollStudent(student);

        for (long id : courseInstance.getEnrolledStudentsIds()) {
            System.out.println(id);
        }
    }

    private static CourseInstance createTestCourseInstance(Teacher teacher) {
        BigDecimal price = new BigDecimal(500);
        LocalDate startDate = LocalDate.of(2023, Month.APRIL, 21);

        CourseInstance courseInstance = new CourseInstance(CourseName.ProgrammingWithJava, price, startDate, teacher);
        return courseInstance;
    }

    private static Teacher createTestTeacher() {
        String firstName = "Michael";
        String lastName = "Smith";
        int age = 32;
        BigDecimal salary = new BigDecimal(1500);

        Teacher teacher = new Teacher(firstName, lastName, age, salary);
        return teacher;
    }

    private static Student createTestStudent() {
        String firstName = "George";
        String lastName = "Michael";
        int age = 24;
        String telephoneNumber = "+359 888 999 233";

        Student student = new Student(firstName, lastName, age, telephoneNumber);
        return student;
    }
}
