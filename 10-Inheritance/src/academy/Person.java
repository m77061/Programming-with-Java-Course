package academy;

import validator.Validator;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private final String email;

    public Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.email = this.generateEmail();
    }

    public void setFirstName(String firstName) {
        this.firstName = Validator.validateName(firstName);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = Validator.validateName(lastName);
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAge(int age) {
        this.age = Validator.validateAge(age);
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    private String generateEmail() {
        return String.format("%s.%s@academy.com", this.getFirstName(), this.getLastName());
    }
}
