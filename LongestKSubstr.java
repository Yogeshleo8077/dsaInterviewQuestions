import java.util.HashMap;

public class LongestKSubstr {
    public static int longestKSubstr(String str, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char leftChar = str.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
                ;
            }

            // update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String str = "eceba";
        int k = 2;

        System.out.println(longestKSubstr(str, k));
    }
}
