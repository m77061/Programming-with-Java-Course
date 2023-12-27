import java.util.Scanner;

public class WallShooting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] wall = {
            {3, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7},
            {9, 8, 7, 5, 9, 8, 7, 4, 5, 9, 6},
            {3, 6, 5, 4, 8, 9, 6, 3, 2, 1, 5},
            {6, 9, 8, 5, 3, 2, 1, 5, 6, 3, 2},
            {3, 2, 6, 9, 8, 5, 6, 3, 2, 1, 3},
            {3, 6, 9, 9, 8, 5, 2, 3, 1, 2, 5}
        };

        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());
        int radius = Integer.parseInt(scanner.nextLine());

        for (int r = 0; r < wall.length; r++) {
            for (int c = 0; c < wall[r].length; c++) {
                double distance = Math.sqrt((r - row) * (r - row) + (c - column) * (c - column));

                if (distance <= radius) {
                    wall[r][c] = 0;
                }
            }
        }

        printMatrix(wall);
    }

    public static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }

            System.out.println();
        }
    }
}
