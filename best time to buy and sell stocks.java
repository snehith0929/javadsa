class Solution 
{
    public int maxProfit(int[] prices)
    {
        int profit=0;
        int low=prices[0];
        for(int i=1; i<prices.length; i++)
        {
            int temp=prices[i]-low;
            profit=Math.max(profit,temp);
            low=Math.min(prices[i],low);

        }
        return profit;
    }
}
        
    