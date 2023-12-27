import java.util.Scanner;

public class ReverseElements {
    public static void main(String[] args) {
        double[] numbers = readArray();

        reverse(numbers);
        print(" ", numbers);
    }

    public static void print(String separator, double[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);

            if (index < array.length - 1) {
                System.out.print(separator);
            }
        }

        System.out.println();
    }

    public static void reverse(double[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            double temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
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
