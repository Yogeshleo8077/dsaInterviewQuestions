import java.util.Stack;

public class PreviousGreaterElement {
    public static int[] previousGreaterElement(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.add(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 4, 2, 20, 40, 12, 30 };
        int result[] = previousGreaterElement(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
