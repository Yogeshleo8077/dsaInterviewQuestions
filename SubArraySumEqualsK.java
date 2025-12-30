import java.util.HashMap;

public class SubArraySumEqualsK {
    public static int subarraySum(int arr[], int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int currentSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1 };
        int k = 2;

        System.out.println(subarraySum(arr, k));
    }
}
