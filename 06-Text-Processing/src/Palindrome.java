public class Palindrome {
    public static void main(String[] args) {
        String text = "racecar";
        boolean isPalindrome = true;

        for (int index = 0; index < text.length() / 2; index++) {
            if (text.charAt(index) != text.charAt(text.length() - index - 1)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
