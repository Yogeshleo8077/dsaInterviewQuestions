import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElements2 {
    public static int[] nextGreaterElements(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int result[] = new int[n];
        Arrays.fill(result, -1);

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;

            while (!stack.isEmpty() && stack.peek() <= arr[idx]) {
                stack.pop();
            }

            if (i < n) {
                result[idx] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(arr[idx]);
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1 };
        int result[] = nextGreaterElements(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
