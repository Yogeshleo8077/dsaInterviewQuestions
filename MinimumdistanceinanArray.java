public class MinimumdistanceinanArray {
    public static int minDistance(int arr[], int x, int y) {
        int lastX = -1;
        int lastY = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastX = i;
                if (lastY != -1) {
                    minDistance = Math.min(minDistance, Math.abs(lastX - lastY));
                }
            }

            if (arr[i] == y) {
                lastY = i;

                if (lastX != -1) {
                    minDistance = Math.min(minDistance, Math.abs(lastX - lastY));
                }
            }
        }

        if (minDistance == Integer.MAX_VALUE) {
            return -1;
        }

        return minDistance;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2 };
        int x = 1;
        int y = 2;

        System.out.println(minDistance(arr, x, y));
    }
}
