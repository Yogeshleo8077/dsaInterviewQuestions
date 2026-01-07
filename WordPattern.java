import java.util.HashMap;

public class WordPattern {
    public static boolean isMatch(String pattern, String str) {
        String words[] = str.split(" ");

        // Length Must Equal
        if (words.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> patternToWord = new HashMap<>();
        HashMap<String, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String word = words[i];

            if (patternToWord.containsKey(pChar)) {
                if (!patternToWord.get(pChar).equals(word)) {
                    return false;
                }
            } else {
                patternToWord.put(pChar, word);
            }

            if (wordToPattern.containsKey(word)) {
                if (wordToPattern.get(word) != pChar) {
                    return false;
                }
            } else {
                wordToPattern.put(word, pChar);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "dog cat cat dog";
        String pattern = "abba";

        System.out.println(isMatch(pattern, str));
    }
}
