import java.util.Scanner;

public class InsertArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int elementsToInsertCount = Integer.parseInt(scanner.nextLine());
        int[] newArray = new int[numbers.length + elementsToInsertCount];

        for (int index = 0; index < numbers.length; index++) {
            newArray[index] = numbers[index];
        }

        int index = numbers.length;

        for (int counter = 1; counter <= elementsToInsertCount; counter++) {
            int element = Integer.parseInt(scanner.nextLine());
            newArray[index] = element;
            index++;
        }

        System.out.print("[ ");

        for (int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println("]");
    }
}
