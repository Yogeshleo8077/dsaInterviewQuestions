public class SwapVowels {
    public static String reverseVowels(String str) {
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {

            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            while (left < right && !isVowel(arr[right])) {
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

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'o' || c == 'e' || c == 'u' || c == 'A' || c == 'E' ||
                c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        String str = "IceCreAm";
        System.out.println(reverseVowels(str));
    }
}
