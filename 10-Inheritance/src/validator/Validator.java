package validator;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Validator {
    private static final byte MIN_NAME_LENGTH = 5;
    private static final byte MAX_NAME_LENGTH = 30;
    private static final byte MIN_AGE = 18;
    private static final short MIN_SALARY_BGN = 580;
    private static final String TELEPHONE_NUMBER_PREFIX = "+359";
    private static final short MIN_COURSE_PRICE = 100;
    private static final short MAX_COURSE_PRICE = 1000;

    private Validator() {}

    public static String validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Given name is null or empty!");
        }

        boolean validLength = MIN_NAME_LENGTH <= name.length() && name.length() <= MAX_NAME_LENGTH;

        if (!validLength) {
            throw new IllegalArgumentException("Given name has invalid length!");
        }

        for (int index = 0; index < name.length(); index++) {
            char symbol = name.charAt(index);
            boolean isUppercaseLetter = 65 <= symbol && symbol <= 90;
            boolean isLowercaseLetter = 97 <= symbol && symbol <= 122;
            boolean containsSpecialCharacter = !(isUppercaseLetter || isLowercaseLetter);

            if (containsSpecialCharacter) {
                throw new IllegalArgumentException("Given name contains special character!");
            }
        }

        return name.trim();
    }

    public static int validateAge(int age) {
        boolean isValid = 0 <= age && age <= 100;

        if (!isValid) {
            throw new IllegalArgumentException("Given age is invalid");
        }

        if (age < MIN_AGE) {
            throw new IllegalArgumentException("Given age is less than " + MIN_AGE + "!");
        }

        return age;
    }

    public static BigDecimal validateSalary(BigDecimal salaryBgn) {
        boolean isValid = salaryBgn.compareTo(new BigDecimal(MIN_SALARY_BGN)) >= 0;

        if (!isValid) {
            throw new IllegalArgumentException("Given salary is less than " + MIN_SALARY_BGN + "!");
        }

        return salaryBgn;
    }

    public static String validateTelephoneNumber(String telephoneNumber) {
        boolean isValid = telephoneNumber.startsWith(TELEPHONE_NUMBER_PREFIX);

        if (!isValid) {
            throw new IllegalArgumentException("Given telephone number does not have the required prefix!");
        }

        return telephoneNumber;
    }

    public static BigDecimal validateCoursePrice(BigDecimal price) {
        boolean lessThanMin = price.compareTo(new BigDecimal(MIN_COURSE_PRICE)) < 0;
        boolean greaterThanMax = price.compareTo(new BigDecimal(MAX_COURSE_PRICE)) > 0;

        if (lessThanMin || greaterThanMax) {
            throw new IllegalArgumentException("Given course price is outside the range!");
        }

        return price;
    }

    public static LocalDate validateStartDate(LocalDate startDate) {
        boolean isValid = startDate.isAfter(LocalDate.now());

        if (!isValid) {
            throw new IllegalArgumentException("Given start date is invalid!");
        }

        return startDate;
    }
}
