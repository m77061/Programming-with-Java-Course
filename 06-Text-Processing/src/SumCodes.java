public class SumCodes {
    public static void main(String[] args) {
        String word = "Java";
        int asciiCodesSum = 0;

        for (int index = 0; index < word.length(); index++) {
            char symbol = word.charAt(index);
            asciiCodesSum += (int)symbol;
        }

        System.out.println(asciiCodesSum);
    }
}
