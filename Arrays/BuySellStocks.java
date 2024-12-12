public class BuySellStocks {

    public static int Stocks(int prices[]){
        int buyPrice= Integer.MAX_VALUE;
        int maxProfit= 0;

        for(int i=0;i<prices.length;i++){
            //check buy price should be less than sell price
            if(buyPrice<prices[i]){
                //count profit
                int profit = prices[i] - buyPrice;
                //save that profit into maxprofit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                //if price is less than buy stock on that price
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = { 7,1,5,3,6,4};
        System.out.println(Stocks(prices));

    }
}
