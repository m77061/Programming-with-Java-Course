import java.util.Scanner;

public class ArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = readArray(scanner);
        char operation = scanner.nextLine().charAt(0);
        int number = reduceArray(operation, numbers);

        System.out.println(number);
    }

    public static int reduceArray(char operation, int[] array) {
        int result = 0;

        if (operation == '+') {
            for (int index = 0; index < array.length; index++) {
                result += array[index];
            }
        } else if (operation == '-') {
            result = array[0];

            for (int index = 1; index < array.length; index++) {
                result -= array[index];
            }
        } else if (operation == '*') {
            result = 1;

            for (int index = 0; index < array.length; index++) {
                result *= array[index];
            }
        }

        return result;
    }

    public static int[] readArray(Scanner scanner) {
        int elementsCount = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[elementsCount];

        for (int index = 0; index < elementsCount; index++) {
            numbers[index] = Integer.parseInt(scanner.nextLine());
        }

        return numbers;
    }
}
