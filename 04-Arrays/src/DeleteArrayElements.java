import java.util.Scanner;

public class DeleteArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int elementsToDeleteCount = Integer.parseInt(scanner.nextLine());

        for (int counter = 1; counter <= elementsToDeleteCount; counter++) {
            int element = Integer.parseInt(scanner.nextLine());

            for (int index = 0; index < numbers.length; index++) {
                if (numbers[index] == element) {
                    numbers[index] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        int[] newArray = new int[numbers.length - elementsToDeleteCount];
        int counter = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] != Integer.MIN_VALUE) {
                newArray[counter] = numbers[index];
                counter++;
            }
        }

        System.out.print("[ ");

        for (int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println("]");
    }
}
