package academy;

import validator.Validator;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Teacher extends Person {
    private BigDecimal salaryBgn;
    private LocalDate hireDate;

    public Teacher(String firstName, String lastName, int age, BigDecimal salaryBgn) {
        super(firstName, lastName, age);
        this.setSalary(salaryBgn);
        this.hireDate = LocalDate.now();
    }

    public BigDecimal getSalary() {
        return this.salaryBgn;
    }

    public LocalDate getHireDate() {
        return this.hireDate;
    }

    private void setSalary(BigDecimal salaryBgn) {
        this.salaryBgn = Validator.validateSalary(salaryBgn);
    }
}
