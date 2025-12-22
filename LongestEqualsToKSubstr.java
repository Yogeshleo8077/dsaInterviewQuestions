import java.util.HashMap;

public class LongestEqualsToKSubstr {
    public static int longestKSubstr(String str, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = -1;
        int left = 0;

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // remove characters from the left if map exceed k
            while (map.size() > k) {
                char leftChar = str.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            if (map.size() == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String str = "aabacbebebe";
        int k = 3;

        System.out.println(longestKSubstr(str, k));
    }
}
