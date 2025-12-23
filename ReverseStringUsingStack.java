import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return "-1";
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return reversed;
    }

    public static void main(String[] args) {
        String str = "JAVA";
        System.out.println("Reversed String: " + reverseString(str));
    }
}
