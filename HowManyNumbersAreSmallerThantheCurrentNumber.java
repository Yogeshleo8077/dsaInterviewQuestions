import java.util.*;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int arr[]) {

        int sorted[] = arr.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], i);
            }
        }

        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 1, 2, 2, 3 };
        int result[] = smallerNumbersThanCurrent(arr);

        System.out.println();

        for (int num : result) {
            System.out.print(num + " ");
        }

        System.err.println();
    }
}
