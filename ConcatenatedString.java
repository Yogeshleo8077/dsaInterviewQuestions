import java.util.HashSet;

public class ConcatenatedString {
    public static String concatenatedString(String str1, String str2) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (char ch : str1.toCharArray()) {
            set1.add(ch);
        }

        for (char ch : str2.toCharArray()) {
            set2.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : str1.toCharArray()) {
            if (!set2.contains(ch)) {
                sb.append(ch);
            }
        }

        for (char ch : str2.toCharArray()) {
            if (!set1.contains(ch)) {
                sb.append(ch);
            }
        }

        return sb.length() == 0 ? "-1" : sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "aacdb";
        String str2 = "gafd";
        System.out.println(concatenatedString(str1, str2));
    }
}
