package TwoPointer;

public class ReverseArray {
    public static void swap(int arr[], int left, int right) {

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

    }

    public static void reverseArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        reverseArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}