import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int radius = Integer.parseInt(scanner.nextLine());
        double circleArea = Math.PI * radius * radius;

        System.out.println(circleArea);
    }
}