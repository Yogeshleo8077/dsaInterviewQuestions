public class MinimunSizeSubarraySum {
    public static int minSizeSubarraySum(int arr[], int target) {
        int left = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];

            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= arr[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 45, 6, 0, 19 };
        int target = 51;

        System.out.println(minSizeSubarraySum(arr, target));
    }
}