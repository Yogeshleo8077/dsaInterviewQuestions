public class PlusOne {
    public static int[] plusOne(int arr[]) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }

            arr[i] = 0;
        }

        int result[] = new int[n + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 9, 9, 9, 9 };
        int result[] = plusOne(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
