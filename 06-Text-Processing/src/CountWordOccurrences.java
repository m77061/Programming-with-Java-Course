public class CountWordOccurrences {
  public static void main(String[] args) {
    String input = "Linux, Microsoft, Windows, MacOS, Android, Microsoft, Linux";
    String[] words = input.split(", ");
    String word = "Microsoft";
    int counter = 0;

    for (int index = 0; index < words.length; index++) {
      if (word.equals(words[index])) {
        counter++;
      }
    }

    System.out.println(counter);
  }
}
