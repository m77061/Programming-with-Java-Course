import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        double[] numbers = readArray();
        double maxElement = findMaxElement(numbers);

        System.out.println(maxElement);
    }

    public static double findMaxElement(double[] array) {
        double maxElement = Double.MIN_VALUE;

        for (int index = 0; index < array.length; index++) {
            if (array[index] > maxElement) {
                maxElement = array[index];
            }
        }

        return maxElement;
    }

    public static double[] readArray() {
        Scanner scanner = new Scanner(System.in);
        int elementsCount = Integer.parseInt(scanner.nextLine());
        double[] numbers = new double[elementsCount];

        for (int index = 0; index < elementsCount; index++) {
            numbers[index] = Integer.parseInt(scanner.nextLine());
        }

        return numbers;
    }
}
