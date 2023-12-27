import java.util.Scanner;

public class CapitalLetters {
    public static void main(String[] args) {
        String[] words = readArray();

        for (int index = 0; index < words.length; index++) {
            String currentWord = words[index];
            boolean isFirstLetterUpper = currentWord.charAt(0) >= 65 && currentWord.charAt(0) <= 90;

            if (isFirstLetterUpper) {
                System.out.println(currentWord);
            }
        }
    }

    public static String[] readArray() {
        Scanner scanner = new Scanner(System.in);
        int elementsCount = Integer.parseInt(scanner.nextLine());
        String[] array = new String[elementsCount];

        for (int index = 0; index < elementsCount; index++) {
            array[index] = scanner.nextLine();
        }

        return array;
    }
}
