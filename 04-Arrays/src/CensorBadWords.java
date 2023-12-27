import java.util.Scanner;

public class CensorBadWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = readArray(scanner);
        String badWord = scanner.nextLine();

        for (int index = 0; index < words.length; index++) {
            if (words[index].equals(badWord)) {
                words[index] = censorWord(words[index]);
            }
        }

        System.out.print("[ ");

        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println(" ]");
    }

    public static String censorWord(String word) {
        String censored = "";

        for (int counter = 1; counter <= word.length(); counter++) {
            censored += "*";
        }

        return censored;
    }

    public static String[] readArray(Scanner scanner) {
        int elementsCount = Integer.parseInt(scanner.nextLine());
        String[] array = new String[elementsCount];

        for (int index = 0; index < elementsCount; index++) {
            array[index] = scanner.nextLine();
        }

        return array;
    }
}
