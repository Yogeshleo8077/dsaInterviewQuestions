public class PrimeNumberCheck {
    public static boolean isPrime(int n) {

        // If must be greater than 0 and 1
        if (n <= 1) {
            return false;
        }

        // Check for other numbers
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Number has more than 2 factors
            }
        }

        return true;
    }

    public static void main(String args[]) {
        int n = 10;
        boolean result = isPrime(n);

        if (result) {
            System.out.println(n + ": is a Prime Number.");
        } else {
            System.out.println(n + ": number is not a Prime Number.");
        }
    }
}