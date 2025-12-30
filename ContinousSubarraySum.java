import java.util.HashMap;

public class ContinousSubarraySum {
    public static int findMaxLength(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i] == 1 ? 1 : -1;

            if (map.containsKey(currentSum)) {
                maxLen = Math.max(maxLen, i - map.get(currentSum));
            } else {
                map.put(currentSum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 1, 0 };
        System.out.println(findMaxLength(arr));
    }
}
