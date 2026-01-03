public class DecreaseElementsToMakeArrayZigzag {
    public static int movesToMakeZigZag(int arr[]) {
        int n = arr.length;

        int movesEvenPeak = 0;
        int movesOddPeak = 0;

        for (int i = 0; i < n; i++) {
            int left = (i > 0) ? arr[i - 1] : Integer.MAX_VALUE;
            int right = (i < n - 1) ? arr[i + 1] : Integer.MAX_VALUE;

            if (i % 2 == 0) {
                int target = Math.min(left, right) - 1;
                if (arr[i] > target) {
                    movesEvenPeak += arr[i] - target;
                }
            } else {
                int target = Math.min(left, right) - 1;
                if (arr[i] > target) {
                    movesOddPeak += arr[i] - target;
                }
            }
        }

        return Math.min(movesEvenPeak, movesOddPeak);
    }

    public static void main(String[] args) {
        int arr[] = { 9, 6, 1, 6, 2 };
        System.out.println(movesToMakeZigZag(arr));
    }
}
