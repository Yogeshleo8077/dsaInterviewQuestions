public class NextPermutation {
    public static void nextPermutation(int arr[]) {
        int n = arr.length;

        if (arr == null || n <= 1) {
            return;
        }

        int i = n - 2;

        // Find pivot
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If pivot exists, the find successor and swap
        if (i >= 0) {
            int j = n - 1;

            while (j >= 0 && arr[j] <= arr[i]) {
                j--;
            }

            // Swap pivot and successor
            swap(arr, i, j);
        }

        reverse(arr, i + 1, n - 1);
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

    }
}
