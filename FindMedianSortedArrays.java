public class FindMedianSortedArrays {
    public static double findMedianSortedArrays(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int merged[] = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge both arrays
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // copy remaining elements from the arr1
        while (i < n) {
            merged[k++] = arr1[i++];
        }

        // copy remaining elements from the arr2
        while (j < m) {
            merged[k++] = arr2[j++];
        }

        // find median
        int totalLength = n + m;
        if (totalLength % 2 == 1) {
            // Odd length
            return merged[totalLength / 2];
        } else {
            // Even length
            return (merged[totalLength / 2 - 1] + merged[totalLength / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3 };
        int arr2[] = { 2 };
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
