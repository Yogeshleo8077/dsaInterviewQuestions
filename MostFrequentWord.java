import java.util.HashMap;

public class MostFrequentWord {
    public static String mostFrequentWord(String words[], int n) {
        HashMap<String, Integer> freq = new HashMap<>();
        HashMap<String, Integer> firstIndex = new HashMap<>();

        for (int i = 0; i < n; i++) {
            freq.put(words[i], freq.getOrDefault(words[i], 0) + 1);

            if (!firstIndex.containsKey(words[i])) {
                firstIndex.put(words[i], i);
            }
        }

        String result = "";
        int maxFreq = 0;
        int lastIndex = -1;

        for (String word : freq.keySet()) {
            int currFreq = freq.get(word);
            int index = firstIndex.get(word);

            if (currFreq > maxFreq || (currFreq == maxFreq && index > lastIndex)) {
                maxFreq = currFreq;
                lastIndex = index;
                result = word;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String words[] = { "geeks", "for", "geeks" };
        System.out.println(mostFrequentWord(words, 3));
    }
}
