import java.util.*;

public class KeyboardRow {
    public static String[] findWords(String[] words) {

        Set<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        Set<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();

            Set<Character> currentRow;

            char firstChar = lower.charAt(0);

            if (row1.contains(firstChar)) {
                currentRow = row1;
            } else if (row2.contains(firstChar)) {
                currentRow = row2;
            } else {
                currentRow = row3;
            }

            boolean valid = true;

            for (char ch : lower.toCharArray()) {
                if (!currentRow.contains(ch)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String words[] = { "Hello", "Alaska", "Dad", "Peace" };
        String result[] = findWords(words);

        System.out.println("Valid Words: ");
        for (String word : result) {
            System.out.println(word);
        }
    }
}
