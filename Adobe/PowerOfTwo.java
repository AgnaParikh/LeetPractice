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
    /**public boolean isPowerOfTwo(int n){
        
        Math.round(x,10);
        
        return (x==(int)x);
    }**/
    
}