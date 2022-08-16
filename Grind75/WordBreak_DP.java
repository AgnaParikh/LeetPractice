public class wordBreak_DP {
        public boolean wordBreak(String s, List<String> wordDict) {
            
            boolean[] dp=new boolean[s.length()+1];
            dp[s.length()]=true;
            
            for(int i=s.length()-1;i>-1;i--){
                
                for(String w : wordDict){
                    
                        if((i+w.length())<=s.length()){
                            
                            if(s.substring(i,i+w.length()).equals(w)){
                                
                                dp[i]=dp[i+w.length()];
                            }
    
                        }
                    
                        if(dp[i]==true){
                            break;
                        }
                    }               
                                    
                }
            
            return dp[0];
            
            
            
        }
    
}
