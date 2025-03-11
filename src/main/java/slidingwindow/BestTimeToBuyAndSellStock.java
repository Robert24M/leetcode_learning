package slidingwindow;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int currentPrice : prices) {
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            } else if (currentPrice - minPrice > maxProfit) {
                maxProfit = currentPrice - minPrice;
            }
        }
        return maxProfit;
    }
}
