package com.ds.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class BestTimeToBuyAndSellStockIITest {

	@Test
	public void happyPath() {
		int[] stockPrices = { 7, 1, 5, 3, 6, 4 };
		BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
		int profit = bestTimeToBuyAndSellStockII.maxProfit(stockPrices);
		if (profit != 7) {
			System.out.println("Expected 7 found " + profit);
			fail("Not yet implemented");
		}
	}

	@Test
	public void noProfit() {
		int[] stockPrices = { 5, 4, 3, 2, 1 };
		BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
		int profit = bestTimeToBuyAndSellStockII.maxProfit(stockPrices);
		if (profit != 0) {
			System.out.println("Expected 0 found " + profit);
			fail("Not yet implemented");
		}
	}

	@Test
	public void maxProfit() {
		int[] stockPrices = { 1, 2, 3, 4, 5 };
		BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
		int profit = bestTimeToBuyAndSellStockII.maxProfit(stockPrices);
		if (profit != 4) {
			System.out.println("Expected 4 found " + profit);
			fail("Not yet implemented");
		}
	}

	@Test
	public void maxProfitAfterAWhile() {
		int[] stockPrices = { 1, 4, 2, 3, 4, 5, 6, 7, 8 };
		BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
		int profit = bestTimeToBuyAndSellStockII.maxProfit(stockPrices);
		if (profit != 9) {
			System.out.println("Expected 9 found " + profit);
			fail("Not yet implemented");
		}
	}

}
