import java.util.Scanner;

public class ToLowercase {
    public static void main(String[] args) {
        char[] symbols = readArray();
        int upperCaseElementsCount = 0;

        for (int index = 0; index < symbols.length; index++) {
            boolean isUpperCase = symbols[index] >= 65 && symbols[index] <= 90;

            if (isUpperCase) {
                symbols[index] = '\0';
                upperCaseElementsCount++;
            }
        }

        char[] newArray = new char[symbols.length - upperCaseElementsCount];
        int counter = 0;

        for (int index = 0; index < symbols.length; index++) {
            if (symbols[index] != '\0') {
                newArray[counter] = symbols[index];
                counter++;
            }
        }

        System.out.print("[ ");

        for (char element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println("]");
    }

    public static char[] readArray() {
        Scanner scanner = new Scanner(System.in);
        int elementsCount = Integer.parseInt(scanner.nextLine());
        char[] symbols = new char[elementsCount];

        for (int index = 0; index < elementsCount; index++) {
            symbols[index] = scanner.nextLine().charAt(0);
        }

        return symbols;
    }
}
