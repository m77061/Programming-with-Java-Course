import java.util.Scanner;

public class OccurrencesCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = readArray(scanner);
        double number = Integer.parseInt(scanner.nextLine());
        int occurrencesCount = countOccurrences(number, numbers);

        System.out.println(occurrencesCount);
    }

    public static int countOccurrences(double element, double[] array) {
        int occurrences = 0;

        for (int index = 0; index < array.length; index++) {
            if (array[index] == element) {
                occurrences++;
            }
        }

        return occurrences;
    }

    public static double[] readArray(Scanner scanner) {
        int elementsCount = Integer.parseInt(scanner.nextLine());
        double[] numbers = new double[elementsCount];

        for (int index = 0; index < elementsCount; index++) {
            numbers[index] = Integer.parseInt(scanner.nextLine());
        }

        return numbers;
    }
}
