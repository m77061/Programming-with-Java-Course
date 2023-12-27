import java.util.Scanner;

public class MatrixMethods {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(3, 4);

        boolean areIndexesValid = areIndexesValid(matrix, 4, 3);

        int maxElement = findMaxElement(matrix);

        print2x2SubMatrixWithBiggestSum(matrix);
    }

    public static void print2x2SubMatrixWithBiggestSum(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int rowIndex = 0;
        int columnIndex = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int column = 0; column < matrix[0].length - 1; column++) {
                int currentSum =
                    matrix[row][column] +
                    matrix[row + 1][column] +
                    matrix[row][column + 1] +
                    matrix[row + 1][column + 1];

                if (currentSum > max) {
                    max = currentSum;
                    rowIndex = row; // start printing from this row index
                    columnIndex = column; // start printing from this column index
                }
            }
        }

        System.out.println(matrix[rowIndex][columnIndex] + " " + matrix[rowIndex][columnIndex + 1]);
        System.out.println(matrix[rowIndex + 1][columnIndex] + " " + matrix[rowIndex + 1][columnIndex + 1]);
    }

    public static int findMaxElement(int[][] matrix) {
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                if (matrix[row][column] > max) {
                    max = matrix[row][column];
                }
            }
        }

        return max;
    }

    public static boolean areIndexesValid(int[][] matrix, int rowIndex, int columnIndex) {
        boolean isRowValid = rowIndex > 0 && rowIndex < matrix.length;
        boolean isColumnValid = columnIndex > 0 && columnIndex < matrix[0].length;

        return isRowValid && isColumnValid;
    }

    public static int[][] createMatrix(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = Integer.parseInt(scanner.nextLine());
            }
        }

        return matrix;
    }
}
