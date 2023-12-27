package academy;

import validator.Validator;

public class Student extends Person {
    private static long idCounter = 1;

    private final long id;
    private String telephoneNumber;

    public Student(String firstName, String lastName, int age, String telephoneNumber) {
        super(firstName, lastName, age);

        this.id = idCounter;
        idCounter++;

        this.setTelephoneNumber(telephoneNumber);
    }

    public long getId() {
        return this.id;
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    private void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = Validator.validateTelephoneNumber(telephoneNumber);
    }
}
