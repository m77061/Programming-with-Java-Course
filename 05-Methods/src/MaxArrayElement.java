public class MaxArrayElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5446, 4, 3434, 54, 23, 34, 54, 54, 65, 4334};
        int max = Integer.MIN_VALUE;

        for (int index = 0; index < array.length - 1; index++) {
            int currentMax = max(array[index], array[index + 1]);

            if (currentMax > max) {
                max = currentMax;
            }
        }

        System.out.println(max);
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
