package academy;

import validator.Validator;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CourseInstance {
    private static long idCounter = 1;

    private final long id;
    private final CourseName courseName;
    private BigDecimal priceBgn;
    private LocalDate startDate;
    private final Teacher teacher;
    private HashSet<Long> studentIds;

    public CourseInstance(CourseName courseName, BigDecimal priceBgn, LocalDate startDate, Teacher teacher) {
        this.id = idCounter;
        idCounter++;

        this.courseName = courseName;
        this.setPrice(priceBgn);
        this.setStartDate(startDate);
        this.teacher = teacher;
        this.studentIds = new HashSet<Long>();
    }

    public long getId() {
        return this.id;
    }

    public CourseName getCourseName() {
        return this.courseName;
    }

    public BigDecimal getPrice() {
        return this.priceBgn;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void enrollStudent(Student student) {
        this.studentIds.add(student.getId());
    }

    public Set<Long> getEnrolledStudentsIds() {
        return Collections.unmodifiableSet(this.studentIds);
    }

    private void setPrice(BigDecimal priceBgn) {
        this.priceBgn = Validator.validateCoursePrice(priceBgn);
    }

    private void setStartDate(LocalDate startDate) {
        this.startDate = Validator.validateStartDate(startDate);
    }
}
