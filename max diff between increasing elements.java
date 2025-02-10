class Solution {
    public int maximumDifference(int[] nums) 
    {
        int profit=-1;
        int low=nums[0];
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]>low)
            {
            int temp=nums[i]-low;
            profit=Math.max(profit,temp);
            }
            low=Math.min(nums[i],low);
        }
        return profit;
        
    }
}