package slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {

    @Test
    void testMaxProfit_BasicIncreasingPrices() {
        BestTimeToBuyAndSellStock BestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] prices = {1, 2, 3, 4, 5};  // Buy at 1, sell at 5 -> profit = 4
        assertEquals(4, BestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    void testMaxProfit_DecreasingPrices() {
        BestTimeToBuyAndSellStock BestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] prices = {5, 4, 3, 2, 1};  // No profit possible
        assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    void testMaxProfit_SingleDay() {
        BestTimeToBuyAndSellStock BestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] prices = {3};  // Only one price, no transactions possible
        assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    void testMaxProfit_MixedPrices() {
        BestTimeToBuyAndSellStock BestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};  // Buy at 1, sell at 6 -> profit = 5
        assertEquals(5, BestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    void testMaxProfit_AllSamePrices() {
        BestTimeToBuyAndSellStock BestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] prices = {3, 3, 3, 3};  // No profit possible
        assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(prices));
    }

}
