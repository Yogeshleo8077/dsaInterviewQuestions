import java.util.*;

public class MissingElements {
    public static List<Integer> findMissings(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count Frequencies of elements
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> missingList = new ArrayList<>();

        // Find missing elements
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                missingList.add(i);
            }
        }

        return missingList;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 3, 5 };
        int n = 5;
        System.out.println(findMissings(arr, n));
    }
}
