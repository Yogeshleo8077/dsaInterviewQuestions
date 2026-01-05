public class findDifference {
    public static char findTheDifference(String str1, String str2) {
        int freq[] = new int[26];

        for (char ch : str1.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : str2.toCharArray()) {
            freq[ch - 'a']--;
            if (freq[ch - 'a'] < 0) {
                return ch;
            }
        }

        return '_';
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcde";
        System.out.println(findTheDifference(str1, str2));
    }
}
