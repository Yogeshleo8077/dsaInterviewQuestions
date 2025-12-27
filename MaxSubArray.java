public class MaxSubArray {
    public static int maxSum(int arr[]) {
        int n = arr.length;
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSum(arr));
    }
}