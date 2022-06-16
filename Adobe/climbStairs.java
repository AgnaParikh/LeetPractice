class climbStairs {
    
    //Recursion O(2^(height))
    /**
    Base case n=0 return 1
              n<0 return 0
              return climbStairs(n-1)+climbStairs(n-2);
    **/
    
    //DP: Time complexity O(n)
    //Memoization
    public int climbStairs(int n) {
        
        int one=1,two=1;
        
        for(int i=0;i<n-1;i++){
            int temp=one;
            one=one+two;
            two=temp;
            //100System.out.println("one "+one+"two "+two);
        }
        
        return one;
    }
}