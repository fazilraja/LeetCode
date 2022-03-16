
public class BestTimeToBuyandSellStock {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int buy = prices[0];

        for(int i = 0; i < prices.length; i++) {
            //if the next price is less than the first price, than
            if(prices[i] < buy) {
                buy = prices[i];
            }

            maxProfit = Math.max(maxProfit, prices[i] - buy);
        }
        return maxProfit;
    }
}
