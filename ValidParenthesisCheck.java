import java.util.Stack;

public class ValidParenthesisCheck {
    public static boolean isValid(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            // opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // closing brackets
            else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if (ch == ')' && top != '(' || ch == '}' && top != '{' || ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        // stack must be empty at the end
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[(]}";

        System.out.println(isValid(str));
    }
}
