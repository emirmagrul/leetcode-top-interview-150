import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    //O(n) karmaşıklık
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - min);
            }
        }
        return maxProfit;
    }

    /*
    //O(n^2) karmaşıklık
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int bought = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int sold = prices[j];
                if (bought < sold) {
                    maxProfit = Math.max(maxProfit, sold - bought);
                }
            }
        }
        return maxProfit;
    }
     */
}
