import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = Double.parseDouble(scanner.nextLine());
        double salaryAfterFirstMonth = salary * 1.1;
        double salaryAfterSecondMonth = salaryAfterFirstMonth * 1.1;
        double salaryAfterThirdMonth = salaryAfterSecondMonth * 1.1;

        System.out.println("Initial salary: " + salary);
        System.out.println("Salary after first month: " + salaryAfterFirstMonth);
        System.out.println("Salary after second month: " + salaryAfterSecondMonth);
        System.out.println("Salary after third month: " + salaryAfterThirdMonth);
    }
}