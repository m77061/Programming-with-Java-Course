import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] parking = {
            {true, false, true, false, true},
            {false, true, false, false, false},
            {true, true, true, true, false},
            {false, false, false, false, false}
        };

        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());
        boolean validCoordinates =
            row >= 0 && row < parking.length &&
            column >= 0 && column < parking[row].length;

        if (!validCoordinates) {
            System.out.println("Invalid coordinates");
            return;
        }

        boolean isFree = parking[row][column];

        if (isFree) {
            System.out.println("This parking place is free!");
        } else {
            System.out.println("Taken! Please, try again later.");
        }
    }
}
