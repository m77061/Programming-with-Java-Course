public class NumberMethods {
    public static void main(String[] args) {
        int digitsCount = countDigits(343434);

        boolean isPrime = isPrime(3431);

        String parity = getParity(345);

        int[] array = toArray(34987471);
    }

    public static int[] toArray(long number) {
        int digitsCount = countDigits(number);
        int[] array = new int[digitsCount];

        for (int index = array.length - 1; index >= 0; index--) {
            array[index] = (int) (number % 10);
            number /= 10;
        }

        return array;
    }

    public static String getParity(long number) {
        if (number % 2 == 0) {
            return "even";
        }

        return "odd";
    }

    public static boolean isPrime(long number) {
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static int countDigits(long number) {
        int digitsCount = 0;

        while (number > 0) {
            number /= 10;
            digitsCount++;
        }

        return digitsCount;
    }
}
