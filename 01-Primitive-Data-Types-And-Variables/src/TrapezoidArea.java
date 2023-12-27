import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = Integer.parseInt(scanner.nextLine());
        int sideB = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double trapezoidArea = (sideA + sideB) * height / 2.0;

        System.out.println(trapezoidArea);
    }
}