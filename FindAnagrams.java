import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        HashMap<Character, Integer> pCount = new HashMap<>();
        HashMap<Character, Integer> windowCount = new HashMap<>();

        // Count frequencies of p
        for (char ch : p.toCharArray()) {
            pCount.put(ch, pCount.getOrDefault(ch, 0) + 1);
        }

        int windowSize = p.length();

        // First window
        for (int i = 0; i < windowSize; i++) {
            char ch = s.charAt(i);
            windowCount.put(ch, windowCount.getOrDefault(ch, 0) + 1);
        }

        // Check first window is anagram
        if (windowCount.equals(pCount)) {
            result.add(0);
        }

        // Remaining windoq
        for (int i = windowSize; i < s.length(); i++) {
            char newChar = s.charAt(i);
            // add new char to window
            windowCount.put(newChar, windowCount.getOrDefault(newChar, 0) + 1);

            // remove old character from the window
            char oldChar = s.charAt(i - windowSize);
            windowCount.put(oldChar, windowCount.get(oldChar) - 1);

            if (windowCount.get(oldChar) == 0) {
                windowCount.remove(oldChar);
            }

            if (windowCount.equals(pCount)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";

        System.out.println(findAnagrams(s, p));
    }
}