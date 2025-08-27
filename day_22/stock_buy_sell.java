// User function Template for Java
class stock_buy_sell {
  public int maximumProfit(int prices[]) {
    // code here
    int profit = 0, buy = prices[0], i = 0;
    for (i = 1; i < prices.length; i++) {
      if (prices[i] < prices[i - 1]) {
        profit += prices[i - 1] - buy;
        buy = prices[i];
      }
      if (i == prices.length - 1)
        profit += prices[i] - buy;
    }
    return profit;
  }
}
