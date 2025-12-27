public class SortColor {
    public static void sortColor(int arr[]) {
        int current = 0;
        int low = 0;
        int high = arr.length - 1;

        while (current <= high) {
            if (arr[current] == 0) {
                swap(arr, current, low);
                low++;
                current++;
            } else if (arr[current] == 1) {
                current++;
            } else {
                swap(arr, current, high);
                high--;
            }
        }

    }

    private static void swap(int arr[], int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 2, 1, 1, 0 };
        sortColor(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
