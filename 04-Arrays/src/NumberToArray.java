import java.util.Scanner;

public class NumberToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] array = numberToArray(number);

        print(", ", array);
    }

    public static void print(String separator, int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);

            if (index < array.length - 1) {
                System.out.print(separator);
            }
        }

        System.out.println();
    }

    public static int[] numberToArray(int number) {
        int digitsCount = countDigits(number);
        int[] array = new int[digitsCount];

        for (int index = array.length - 1; index >= 0; index--) {
            int lastDigit = number % 10;
            array[index] = lastDigit;
            number /= 10;
        }

        return array;
    }

    public static int countDigits(int number) {
        int digitsCount = 0;

        while (number > 0) {
            digitsCount++;
            number /= 10;
        }

        return digitsCount;
    }
}
