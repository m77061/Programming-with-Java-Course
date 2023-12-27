import java.util.Scanner;

public class PracticeIndexes {
    public static void main(String[] args) {
        int[] array = readArray();
        int sumOddIndexes = 0;
        int productEvenIndexes = 1;

        for (int index = 0; index < array.length; index++) {
            if (index % 2 == 0) {
                productEvenIndexes *= array[index];
            } else {
                sumOddIndexes += array[index];
            }
        }

        System.out.println(sumOddIndexes);
        System.out.println(productEvenIndexes);
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
