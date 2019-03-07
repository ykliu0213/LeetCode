package BestTimeToBuyAndSellStocksII;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		// also can try these following input : 
		// {7,6,4,3,1}
		
		BTBSSII solution = new BTBSSII();
		System.out.println("Given input : " + Arrays.toString(prices));
		System.out.println("Output : " + solution.maxProfit(prices));
	}
}
