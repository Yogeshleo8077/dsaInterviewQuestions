import java.util.Stack;

public class CalculateSpan {
    public static int[] calculateSpan(int arr[]) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int span[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            // calculate span
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int prices[] = { 100, 80, 60, 70, 60, 75, 85 };
        int result[] = calculateSpan(prices);

        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
