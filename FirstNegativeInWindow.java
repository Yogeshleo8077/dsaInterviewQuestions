import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInWindow {
    public static List<Integer> firstNegativeNumber(int arr[], int k) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                q.offer(i);
            }

            if (i >= k - 1) {
                while (!q.isEmpty() && q.peek() < i - k + 1) {
                    q.poll();
                }

                if (!q.isEmpty()) {
                    result.add(arr[q.peek()]);
                } else {
                    result.add(0);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;

        System.out.println(firstNegativeNumber(arr, k));
    }
}
