public class BasicMethods {
    public static void main(String[] args) {
        double max = max(5, 6);
        System.out.println(max);

        double min = min(6, 7);
        System.out.println(min);

        double sum = sum(5, 6);
        System.out.println(sum);

        double product = product(3, 4);
        System.out.println(product);
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        }

        return b;
    }

    public static double min(double a, double b) {
        if (a < b) {
            return a;
        }

        return b;
    }

    public static double sum(double a, double b) {
        double sum = a + b;

        return sum;
    }

    public static double product(double a, double b) {
        double product = a * b;

        return product;
    }
}
