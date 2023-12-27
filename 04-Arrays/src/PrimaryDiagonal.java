public class PrimaryDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4}
        };

        int[] primaryDiagonalElements = getPrimaryDiagonal(matrix);

        print(primaryDiagonalElements);
    }

    public static void print(int[] array) {
        System.out.print("[ ");

        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }

        System.out.println("]");
    }

    public static int[] getPrimaryDiagonal(int[][] matrix) {
        int[] elements = new int[matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (row == column) {
                    elements[column] = matrix[row][column];
                }
            }
        }

        return elements;
    }
}
