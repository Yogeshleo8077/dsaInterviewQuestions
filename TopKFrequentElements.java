import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static List<String> topKFrequentElement(String words[], int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a.compareTo(b); // lexicographically smaller
            }
            return map.get(b) - map.get(a);
        });

        pq.addAll(map.keySet());

        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(pq.poll());
        }

        return result;
    }

    public static void main(String[] args) {
        String words[] = { "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" };
        int k = 4;
        System.out.println();
        System.out.println(topKFrequentElement(words, k));
    }
}
