import java.util.HashSet;
import java.util.HashMap;

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String banned[]) {
        HashSet<String> set = new HashSet<>();
        for (String s : banned) {
            set.add(s.toLowerCase());
        }

        // Remove punctuation
        String cleaned = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

        // Split into words
        String words[] = cleaned.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (word.length() == 0 || set.contains(word)) {
                continue;
            }

            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String result = "";
        int maxFreq = 0;
        for (String word : map.keySet()) {
            if (map.get(word) > maxFreq) {
                maxFreq = map.get(word);
                result = word;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = { "hit" };
        System.out.println(mostCommonWord(paragraph, banned));
    }
}
