import java.util.HashMap;

public class CheckifAnyElementHasPrimeFrequency {
    public static boolean checkPrimeFrequency(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        for (int num : map.values()) {
            if (isPrime(num)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(checkPrimeFrequency(arr));
    }
}
