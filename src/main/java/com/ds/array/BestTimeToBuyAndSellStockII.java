package com.ds.array;

public class BestTimeToBuyAndSellStockII {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0 || prices.length == 1) {
			return 0;
		}
		int profit = 0;
		int buyValue = -1;
		int dayValue = -1;
		int sellValue = 0;
		//7, 1, 5, 3, 6, 4
		for (int i = 1; i < prices.length; i++) {
			if (buyValue == -1) {
				buyValue = prices[i - 1];
				dayValue = buyValue;
			}
			if (dayValue <= prices[i]) {
				if (i == prices.length - 1) {
					return profit + (prices[i] - buyValue);
				}
				dayValue = prices[i];
			} else {
				sellValue = prices[i - 1];
				profit += (sellValue - buyValue);
				buyValue = -1;
			}
		}
		return profit;
	}
}
