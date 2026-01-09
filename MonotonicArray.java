public class MonotonicArray {
    public static boolean isMonotonic(int arr[]) {
        boolean isInc = true;
        boolean isDec = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                isInc = false;
            if (arr[i] > arr[i - 1])
                isDec = false;
        }

        return isInc || isDec;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3 };
        System.out.println(isMonotonic(arr));
    }
}
