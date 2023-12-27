import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {
        double[] array1 = readArray();
        double[] array2 = readArray();
        boolean haveSameElements = compareArrays(array1, array2);

        System.out.println(haveSameElements);
    }

    public static boolean compareArrays(double[] array1, double[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int index = 0; index < array1.length; index++) {
            if (array1[index] != array2[index]) {
                return false;
            }
        }

        return true;
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
