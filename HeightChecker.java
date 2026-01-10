import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int heights[]) {
        int sorted[] = heights.clone();

        int n1 = sorted.length;
        int n2 = heights.length;

        Arrays.sort(sorted);

        int i = 0;
        int j = 0;

        int missMatchCount = 0;

        while (i < n1 && j < n2) {
            if (sorted[i] != heights[j]) {
                missMatchCount++;
            }
            i++;
            j++;
        }

        return missMatchCount;
    }

    public static void main(String[] args) {
        int heights[] = { 1, 1, 4, 2, 1, 3 };
        System.out.println(heightChecker(heights));
    }
}
