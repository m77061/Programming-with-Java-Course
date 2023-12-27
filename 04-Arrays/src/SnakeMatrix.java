import java.util.Scanner;

public class SnakeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        char[][] grid = new char[rows][columns];
        String word = "snake";
        int index = 0;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (index == word.length()) {
                    index = 0;
                }

                grid[row][column] = word.charAt(index);
                index++;
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print(grid[row][column]);
            }

            System.out.println();
        }
    }
}
