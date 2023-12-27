public class FoldMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5, 6},
            {1, 2, 3, 4, 5, 6},
            {1, 2, 3, 4, 5, 6},
            {1, 2, 3, 4, 5, 6}
        };

        int[][] folded = fold(matrix);
        print(folded);
    }

    public static int[][] fold(int[][] matrix) {
        int elementsCount = matrix[0].length / 2;
        int[][] folded = new int[matrix.length][elementsCount];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < elementsCount; column++) {
                folded[row][column] = matrix[row][column] + matrix[row][matrix.length - column + 1];
            }
        }

        return folded;
    }

    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }

            System.out.println();
        }
    }
}
