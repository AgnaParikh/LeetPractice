class BuySellStock {
    
    //O(n)
    public int maxProfit(int[] prices) {
        
        int profit=0;
        int min_val=Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++){
            
            if(prices[i]<min_val){
                min_val=prices[i];
            }
            else if(prices[i]-min_val>profit){
                profit=prices[i]-min_val;
            }
        }
        
        return profit;
    }
}