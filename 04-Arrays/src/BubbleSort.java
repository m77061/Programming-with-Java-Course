public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 6, 7, 3, 4, 6, 1, 43, 5, 1, 2, 5};

        bubbleSort(numbers);
        printArray(numbers);
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");

        for (int element : array) {
            System.out.print(element + " ");
        }

        System.out.println("]");
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
