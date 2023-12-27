import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        int[] numbers = readArray();

        printElements(numbers);
    }

    public static void printElements(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);

            if (index < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public static int[] readArray() {
        Scanner scanner = new Scanner(System.in);
        int elementsCount = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[elementsCount];

        for (int index = 0; index < elementsCount; index++) {
            numbers[index] = Integer.parseInt(scanner.nextLine());
        }

        return numbers;
    }
}
