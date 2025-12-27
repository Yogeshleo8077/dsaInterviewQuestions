public class SingleNumber {
    public static int singleNumber(int arr[]) {
        int result = 0;
        for (int i : arr) {
            result = result ^ i;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(arr));
    }
}
