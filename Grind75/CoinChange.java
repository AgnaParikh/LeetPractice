class Solution {
    public int coinChange(int[] coins, int amount) {
        
        //eg dp[0] to dp[11]
        int[] dp=new int[amount+1];
        dp[0]=0;
        
        for(int i=1;i<amount+1;i++){
            dp[i]=amount+1;
        }
        
        for(int i=0;i<amount+1;i++){
            
            for(int c : coins){
                
                if(i-c >= 0){
                    dp[i]=Math.min(dp[i],1+dp[i-c]);
                }
            }
            
        }
        
        if(dp[amount]==amount+1){
            return -1;
        }
        
        return dp[amount];
    }
}
