class Solution {
    
    //Two pointer approach
    public int findContentChildren(int[] g, int[] s) {
        
        //sort both arrays
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i=g.length-1,j=s.length-1;
        int ans=0;
        
        while(i>=0 && j>=0){
            
            if(s[j]>=g[i]){
                ans++;
                i--;
                j--;
            }
            else{
                i--;
            }
        }
        
        return ans;
        
    }
}
