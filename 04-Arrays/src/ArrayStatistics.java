import java.util.Arrays;
import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {
        double[] numbers = readArray();
        double minElement = findMinElement(numbers);
        double maxElement = findMaxElement(numbers);
        double averageElement = findAverageElement(numbers);
        double sumElements = findSumElements(numbers);
        double productElements = findProductElements(numbers);

        System.out.println(minElement);
        System.out.println(maxElement);
        System.out.println(averageElement);
        System.out.println(sumElements);
        System.out.println(productElements);
    }

    public static double findProductElements(double[] array) {
        double product = 1;

        for (int index = 0; index < array.length; index++) {
            product *= array[index];
        }

        return product;
    }

    public static double findSumElements(double[] array) {
        double sum = 0;

        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }

        return sum;
    }

    public static double findAverageElement(double[] array) {
        Arrays.sort(array);

        double middleElement = array[array.length / 2];
        return middleElement;
    }

    public static double findMinElement(double[] array) {
        double minElement = Double.MAX_VALUE;

        for (int index = 0; index < array.length; index++) {
            if (array[index] < minElement) {
                minElement = array[index];
            }
        }

        return minElement;
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
