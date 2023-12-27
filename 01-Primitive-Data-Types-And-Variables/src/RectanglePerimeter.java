import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = Integer.parseInt(scanner.nextLine());
        int sideB = Integer.parseInt(scanner.nextLine());
        int rectanglePerimeter = 2 * (sideA + sideB);

        System.out.println(rectanglePerimeter);
    }
}