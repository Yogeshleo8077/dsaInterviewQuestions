import java.util.HashMap;

public class ContinuousSubArraySum {
    public static boolean checkSubArray(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            int remainder = currentSum % k;

            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 23, 2, 4, 6, 7 };
        int k = 6;
        System.out.println(checkSubArray(arr, k));
    }
}
