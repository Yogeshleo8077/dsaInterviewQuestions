public class CalculatePower {

    public static int reverse(int n) {
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        return reversed;
    }

    public static int powerHelper(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        int half = powerHelper(base, exponent / 2);
        if (exponent % 2 == 0) {
            return half * half;
        } else {
            return base * half * half;
        }
    }

    public static int reverseExponentiation(int n) {
        // Step 1: Reverse the number
        int reversed = reverse(n);

        // Step 2:
        int result = powerHelper(n, reversed);

        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(reverseExponentiation(n));
    }
}
