class Solution {
    public int mySqrt(int x) {
        
        if(x==0){
            return 0;
        }
        
        if(x==1){
            return 1;
        }
        
        int ans=0;
        
        int left=1,right=x/2;
        
        while(left<=right){
            
            //mid
            int mid=left+(right-left)/2;
            
            //if mid*mid==x, return mid
            if(mid*mid == x){
                ans=mid;
                break;
            }
            
            //if mid*mid>x search left
            if(mid > x/mid){
                right=mid-1;
            }
            
            //else right
            else{
                ans=mid;
                left=mid+1;
            }
            
        }
        
        return ans;
    }
}
