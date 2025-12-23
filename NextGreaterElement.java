import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int nge[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        return nge;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 10, 8 };
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int result[] = nextGreaterElement(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
