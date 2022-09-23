class Solution {
    
    List<String> ans;
    
    public List<String> generateParenthesis(int n) {
        
        if(n==0){
            return new ArrayList<String>();
        }
        
        ans=new ArrayList<>();
        
        backtrack("",0,0,n);
        
        return ans;
        
    }
    
    private void backtrack(String currString, int open, int close, int max ){
        
        if(currString.length()==max*2){
            ans.add(currString);
            return;
        }
        
        if(open<max){
            backtrack(currString+"(", open+1,close,max);
        }
        
        if(close<open){
            backtrack(currString+")",open,close+1,max);
        }
        
    }
}