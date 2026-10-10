class Solution {
    public int maxProfit(int[] prices) {
        
        int[] difference  = new int[prices.length-1];
        for(int i = 0; i<prices.length-1; i++){
            difference[i] = prices[i+1]- prices[i];
        }
        int profit = 0;
        for(int i = 0; i<difference.length;i++){
            if(difference[i]>=0){
                profit  = profit + difference[i];
            }
        }
        return profit;
    }
}