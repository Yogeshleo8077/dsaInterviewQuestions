public class SmallestSubarrayWithSum {
    public static int smallestSubarrayWithSum(int arr[], int k) {
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum >= k) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }

        return minLen == Integer.MIN_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 2, 3, 2 };
        int k = 7;

        System.out.println(smallestSubarrayWithSum(arr, k));
    }
}
