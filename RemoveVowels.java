public class RemoveVowels {
    public static String removeVowel(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                continue;
            }

            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "welcome to geeksforgeeks";
        System.out.println(removeVowel(str));
    }
}
