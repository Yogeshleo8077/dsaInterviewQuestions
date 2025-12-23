public class StockBuyAndSell {
    public static int maxProfit(int price[]) {
        int buy1 = -price[0];
        int sell1 = 0;
        int buy2 = -price[0];
        int sell2 = -price[0];

        for (int i = 1; i < price.length; i++) {
            buy1 = Math.max(buy1, -price[i]);
            sell1 = Math.max(sell1, buy1 + price[i]);

            buy2 = Math.max(buy2, sell1 - price[i]);
            sell2 = Math.max(sell2, buy2 + price[i]);
        }

        return sell2;
    }

    public static void main(String[] args) {
        int prices[] = { 3, 3, 5, 0, 0, 3, 1, 4 };

        System.out.println(maxProfit(prices));
    }
}