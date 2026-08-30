class Solution {
    public int maxProfit(int[] prices) {

        int l = 0;
        int r = 1;
        int n = prices.length;
        int profit = 0;
         int buyPrice = 0;

        while(r < n){
            if(prices[l] <= prices[r]){
                buyPrice = prices[l];
                profit = Math.max(profit,prices[r]-buyPrice);
                r++;
            }else{
                if(prices[r]<prices[l]){
                    l = r;
                    r++;
                }else{
                    
                l++;
                r++;
                }
            }

        }
        return profit;
        
    }
}
