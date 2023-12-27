import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = Integer.parseInt(scanner.nextLine());
            }
        }

        int[][] rotated = new int[columns][rows];

        for (int row = 0; row < columns; row++) {
            for (int column = 0; column < rows; column++) {
                rotated[row][column] = matrix[rows - 1 - column][row];
            }
        }
    }
}
