public class ThreeWayPartitioing {
    public static void threeWayPartition(int arr[], int a, int b) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] < a) {
                swap(arr, low, mid);
                mid++;
                low++;
            } else if (arr[mid] > b) {
                swap(arr, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32 };
        int a = 10;
        int b = 20;

        threeWayPartition(arr, a, b);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
