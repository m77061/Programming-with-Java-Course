public class CountPunctuationSigns {
    public static void main(String[] args) {
        String text = "Nulla elementum porta tristique? Vestibulum pharetra, elementum sem eu malesuada! Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.";
        char[] signs = { '.', '?', '!', ',' };
        int counter = 0;

        for (int index = 0; index < text.length(); index++) {
            if (contains(signs, text.charAt(index))) {
                counter++;
            }
        }

        System.out.println(counter);
    }

    public static boolean contains(char[] array, char element) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == element) {
                return true;
            }
        }

        return false;
    }
}
