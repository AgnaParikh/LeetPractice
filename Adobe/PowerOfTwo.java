class PowerOfTwo {
    
    //Approach 1: Recursion
    
    public boolean isPowerOfTwo(int n) {
        
       // System.out.println(n);
        
        
        if(n==1){
            return true;
        }
        
        if(n%2!=0 || n==0){
            return false;
        }
        
        if(isPowerOfTwo(n/2)){
            return true;
        }

        return false;        
    }
    
    
    //Using log
    // O(1)
    /** 
    class Solution {
        public boolean isPowerOfThree(int n) {
            return (Math.log10(n) / Math.log10(3)) % 1 == 0;
        }
    **/
}