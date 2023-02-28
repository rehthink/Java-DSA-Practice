package SDE_Sheet.DAY1;

public class StockBuyAndSell {

    static int maxProfit(int[] prices){
        int min = prices[0];
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            int profit = prices[i] -min;
            max = Math.max(max, profit);
        }
        return max;
    }

    public static void main(String[] args) {

        int prices[] = {22, 32,56,18};
        System.out.println(maxProfit(prices));
    }
}
