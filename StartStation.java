public class StartStation {
    public static int gasStation(int gas[], int cost[]) {
        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            totalCost += cost[i];
            totalGas += gas[i];

            tank += gas[i] - cost[i];

            // if fuel becomes negative, change starting point
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }

        }

        // final check
        if (totalGas < totalCost) {
            return -1;
        }
        return start;
    }

    public static void main(String[] args) {
        int gas[] = { 1, 2, 3, 4, 5 };
        int cost[] = { 3, 4, 5, 1, 2 };
        System.out.println(gasStation(gas, cost));
        System.out.println();
    }
}