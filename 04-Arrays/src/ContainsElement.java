public class ContainsElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 5;
        boolean contains = containsElement(numbers, number);

        System.out.println(contains);
    }

    public static boolean containsElement(int[] array, int element) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == element) {
                return true;
            }
        }

        return false;
    }
}
