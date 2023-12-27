import java.util.Scanner;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] integerNumbers = createIntegerNumbersArray(5);

        double[] realNumbers = createRealNumbersArray(5);

        boolean contains = containsElement(realNumbers, 3);

        int count = countElementOccurrences(realNumbers, 1);

        printArray(integerNumbers);
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");

        for (int index = 0; index < array.length - 1; index++) {
            System.out.print(array[index] + ", ");
        }

        System.out.println(array[array.length - 1] + " ]");
    }

    public static int countElementOccurrences(double[] array, double element) {
        int counter = 0;

        for (int index = 0; index < array.length; index++) {
            if (array[index] == element) {
                counter++;
            }
        }

        return counter;
    }

    public static boolean containsElement(double[] array, double element) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == element) {
                return true;
            }
        }

        return false;
    }

    public static double[] createRealNumbersArray(int length) {
        double[] array = new double[length];

        for (int index = 0; index < length; index++) {
            array[index] = index + 1;
        }

        return array;
    }

    public static int[] createIntegerNumbersArray(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];

        for (int index = 0; index < length; index++) {
            array[index] = Integer.parseInt(scanner.nextLine());
        }

        return array;
    }
}
