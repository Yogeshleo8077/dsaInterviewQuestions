public class CountPrimes {
    public static int countPrime(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean isPrime[] = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // sieve of Enthostheses
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(countPrime(n));

    }
}
