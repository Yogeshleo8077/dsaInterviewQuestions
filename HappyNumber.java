public class HappyNumber {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = getSumOfSquares(slow);
            fast = getSumOfSquares(getSumOfSquares(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private static int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        if (isHappy(n)) {
            System.err.println(n + ": is a Happy Number.");
        } else {
            System.out.println(n + ": is'nt a Happy Number.");
        }
    }
}
