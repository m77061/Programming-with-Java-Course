public class PrintMatrices {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {3, 5, 3, 1},
            {4, 5, 7, 5},
            {5, 8, 4, 1}
        };

        int[][] matrix2 = {
            {34, 54, 14, 5},
            {6, 65, 3, 4},
            {4, 5, 6, 1},
            {4, 5, 99885, 4}
        };

        int[][] matrix3 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        printMatrix(", ", matrix1);
        printMatrix(" | ", matrix2);
        printMatrix(" ", matrix3);
    }

    public static void printMatrix(String separator, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                int element = matrix[row][column];
                System.out.print(element);

                if (column < matrix[row].length - 1) {
                    System.out.print(separator);
                }
            }

            System.out.println();
        }
    }
}
