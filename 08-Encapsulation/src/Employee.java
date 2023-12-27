import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String department;
    private BigDecimal salaryUsd;
    private String address;

    public Employee(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.generateEmail();
    }

    public Employee(String firstName, String lastName, LocalDate birthDate) {
        this(firstName, lastName);
        this.setBirthDate(birthDate);
    }

    public String getFirstName() {
        return this.firstName;
    }

    private void setFirstName(String firstName) {
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be null or empty string!");
        }

        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    private void setLastName(String lastName) {
        if (lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null or empty string!");
        }

        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    private void setBirthDate(LocalDate birthDate) {
        int currentYear = LocalDate.now().getYear();
        int year = birthDate.getYear();

        if (currentYear - year > 100) {
            throw new IllegalArgumentException("Invalid age! Age should be in range [1 .. 100]");
        }

        this.birthDate = birthDate;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        if (department.isEmpty()) {
            throw new IllegalArgumentException("Department name cannot be null or empty string!");
        }

        this.department = department;
    }

    public BigDecimal getSalaryUsd() {
        return this.salaryUsd;
    }

    public void setSalaryUsd(BigDecimal salaryUsd) {
        BigDecimal minSalary = new BigDecimal(1000);

        if (salaryUsd.compareTo(minSalary) < 0) {
            throw new IllegalArgumentException("Salary cannot be less than minimal salary!");
        }

        this.salaryUsd = salaryUsd;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        if (address.isEmpty()) {
            throw new IllegalArgumentException("Address cannot be null or empty string!");
        }

        this.address = address;
    }

    private void generateEmail() {
        this.email = this.firstName + "." + this.lastName + "@gmail.com";
    }
}