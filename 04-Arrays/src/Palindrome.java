import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int[] array = readArray();
        boolean isPalindrome = isPalindrome(array);

        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            if (array[index] != array[array.length - index - 1]) {
                return false;
            }
        }

        return true;
    }

    public static int[] readArray() {
        Scanner scanner = new Scanner(System.in);
        int elementsCount = Integer.parseInt(scanner.nextLine());
        int[] array = new int[elementsCount];

        for (int index = 0; index < elementsCount; index++) {
            array[index] = Integer.parseInt(scanner.nextLine());
        }

        return array;
    }
}
