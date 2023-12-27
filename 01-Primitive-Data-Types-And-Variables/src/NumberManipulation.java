import java.util.Scanner;

public class NumberManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int abcd = Integer.parseInt(scanner.nextLine());

        int d = abcd % 10;
        int c = abcd / 10 % 10;
        int b = abcd / 100 % 10;
        int a = abcd / 1000;

        int digitsSum = a + b + c + d;
        System.out.println(digitsSum);

        int dbca = d * 1000 + b * 100 + c * 10 + a;
        System.out.println(dbca);

        int dcba = d * 1000 + c * 100 + b * 10 + a;
        System.out.println(dcba);
    }
}