public class TrailingZeros {
    public static int trailingZeros(int n) {
        int count = 0;
        while (n >= 5) {
            n = n / 5;
            count = count + n;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(trailingZeros(n));
    }
}
