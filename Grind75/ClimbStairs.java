public class ClimbStairs {
    
        //Memoization DP
        //O(n)
        public int climbStairs(int n){
            
            int one=1,two=1;
            
            for(int i=0;i<n-1;i++){
                int temp=one;
                one=one+two;
                two=temp;
            }
            
            return one;        
        }
        
        //Brute force
        //O(height of treee) O(nlogn)
        /*public int climbStairs(int n) {
            
            if(n==0){
                return 1;
            }
            
            if(n<0){
                return 0;
            }
            
            return climbStairs(n-1)+climbStairs(n-2);
                
            
        }*/
    
}
