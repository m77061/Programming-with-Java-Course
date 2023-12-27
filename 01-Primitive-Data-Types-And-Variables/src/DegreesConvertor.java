import java.util.Scanner;

public class DegreesConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsiusDegrees = Double.parseDouble(scanner.nextLine());
        double fahrenheitDegrees = celsiusDegrees * 9 / 5 + 32;

        System.out.println(fahrenheitDegrees);
    }
}