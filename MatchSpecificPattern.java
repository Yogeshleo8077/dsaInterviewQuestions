import java.util.ArrayList;
import java.util.HashMap;

public class MatchSpecificPattern {
    public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern) {
        ArrayList<String> result = new ArrayList<>();

        for (String word : dict) {

            // Length Must Match
            if (word.length() != pattern.length()) {
                continue; // skip that word
            }

            HashMap<Character, Character> patternToWord = new HashMap<>();
            HashMap<Character, Character> wordToPattern = new HashMap<>();

            boolean isMatch = true;

            for (int i = 0; i < pattern.length(); i++) {
                char pChar = pattern.charAt(i);
                char wChar = word.charAt(i);

                // Pattern -> word
                if (patternToWord.containsKey(pChar)) {
                    if (patternToWord.get(pChar) != wChar) {
                        isMatch = false;
                        break;
                    }
                } else {
                    patternToWord.put(pChar, wChar);
                }

                // Word -> pattern
                if (wordToPattern.containsKey(wChar)) {
                    if (wordToPattern.get(wChar) != pChar) {
                        isMatch = false;
                        break;
                    }
                } else {
                    wordToPattern.put(wChar, pChar);
                }

            }

            if (isMatch) {
                result.add(word);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> dict = new ArrayList<>();

        dict.add("abb");
        dict.add("abc");
        dict.add("xyz");
        dict.add("xyy");

        String pattern = "foo";

        ArrayList<String> matchedWords = findMatchedWords(dict, pattern);
        System.out.println();
        for (String word : matchedWords) {
            System.out.println(word + " ");
        }

        System.out.println();
    }
}
