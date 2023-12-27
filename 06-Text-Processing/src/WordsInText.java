public class WordsInText {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam eros sem, fermentum at enim euismod, pellentesque tempus turpis. Aliquam at efficitur velit. Aliquam ac imperdiet lorem.";
        String[] wordsAndSigns = text.split(" ");
        int wordsCount = 0;

        for (int index = 0; index < wordsAndSigns.length; index++) {
            String element = wordsAndSigns[index];

            if (element.equals(",") ||
                    element.equals(".") ||
                    element.equals("!") ||
                    element.equals("?")) {
                continue;
            }

            wordsCount++;
        }

        System.out.println(wordsCount);
    }
}
