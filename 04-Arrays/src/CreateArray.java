import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] array = new int[number];

        for (int index = 0; index < array.length; index++) {
            array[index] = index * 2;
        }

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
}
