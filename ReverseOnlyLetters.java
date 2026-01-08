public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String str) {
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (left < right && !Character.isLetter(arr[left])) {
                left++;
            }

            while (left < right && !Character.isLetter(arr[right])) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "Test1ng-Leet=code-Q!";
        System.out.println();
        System.out.println("Original String: " + str);
        System.out.println();
        System.out.println("Revesed String: " + reverseOnlyLetters(str));
        System.out.println();
    }
}
