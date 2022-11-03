package SDE_Sheet.Arrays;

public class StockSellAndBuy {

    /*
    * The cost of a stock on each day is given in
    * an array. Find the maximum profit that you
    * can make by buying and selling on those days.
    * If the given array of prices is sorted in
    * decreasing order, then profit cannot be earned at all.
     * */

    public static void main(String[] args) {
        int[] arr = { 100, 180, 260, 310, 40, 535, 695 };
        int start = 0;
        int end = arr.length;
        System.out.println(maxProfit(arr, 0, end));
    }

    static int maxProfit(int[] arr, int start, int end) {

        int profit = 0;


        for (int i = 1; i< end; i++) {
            if (arr[i]>arr[i-1]){
                profit += arr[i] - arr[i-1];
            }
        }


        //
//        if (end<=start) {
//            return  0;
//        }
//
//        for (int i = start; i<end; i++) {
//
//            for (int j = 1+1; j<=end; j++) {
//
//                if (arr[j]>arr[i]) {
//                    int curr_profit = arr[j]-arr[i] + (maxProfit(arr, start, i-1) + maxProfit(arr, j+1, end));
//
//                    profit = Math.max(profit, curr_profit);
//                }
//            }
//        }

        return profit;
    }
}
