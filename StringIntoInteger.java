public class StringIntoInteger {
    public static int changeIntoInteger(String str) {
        // Base case: Empty String
        if (str.length() == 0 || str == null) {
            return 0;
        }

        int n = str.length();
        int i = 0;

        // Check for white spaces
        while (i < n && str.charAt(i) == ' ') {
            i++;
        }

        if (i == n) {
            return 0;
        }

        int sign = 1;
        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        long result = 0;
        while (i < n && Character.isDigit(str.charAt(i))) {
            int digit = str.charAt(i) - '0';
            result = result * 10 + digit;

            // Check for overflow
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            // Check for underflow
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * result);
    }

    public static void main(String[] args) {
        String str = "   -123";
        System.out.println(changeIntoInteger(str));
    }
}
