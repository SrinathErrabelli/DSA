package Arrrays;

public class BuyAndSellStocks {

    public static void main(String[] args) {

        int prices[]={7,1,5,4,6,3};

        int maximumProfit=maxProfit(prices);

        System.out.println("Maximum profit is:"+maximumProfit);
    }

    public static int maxProfit(int prices[])
    {
        int maxprofit=0;
        int buyPrice=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice<prices[i])
            {
                int profit=prices[i]-buyPrice;

                maxprofit=Math.max(maxprofit,profit);
            }
            else {
                buyPrice=prices[i];
            }
        }

        return maxprofit;
    }
}
