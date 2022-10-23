class Solution {
    
    /**
        Find the mid element of the array.

        If mid element > first element of array this means that we need to look for         the inflection point on the right of mid.

        If mid element < first element of array this that we need to look for the           inflection point on the left of mid.

    **/
   public int findMin(int[] nums) {
        
        if(nums.length==1){
            return nums[0];
        }
        
        int left=0,right=nums.length-1;
        int result=Integer.MAX_VALUE;
       
        if (nums[right] > nums[0]) {
            return nums[0];
        }
        
        while(left<=right){
            if (nums[right] > nums[left]) {
                result=Math.min(result,nums[left]);
                break;
             }
            
            
            //Mid
            int mid=left+(right-left)/2;
            
            result=Math.min(result,nums[mid]);
            
            //Check if we are in left sorted portion search right
            if(nums[left]<=nums[mid]){
                left=mid+1;
            }
            
            //If we are in right, search  left
            else if(nums[left]>nums[mid]){
                right=mid-1;
            }
        }
        
        return result;
        
    }
}
