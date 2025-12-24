import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static int longestSubsequence(int arr[]) {
        int maxStreak = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNumber = 1;
                int currentStreak = 1;

                while (set.contains(currentNumber + 1)) {
                    currentNumber++;
                    currentStreak++;
                }

                maxStreak = Math.max(maxStreak, currentStreak);
            }
        }

        return maxStreak;
    }

    public static void main(String[] args) {
        int arr[] = { 15, 13, 12, 14, 11, 10, 9, 16 };
        System.out.println();
        System.out.println(longestSubsequence(arr));
        System.out.println();
    }
}
