class Solution {
    
    int ans;
    
    //Binary Search
    public int searchInsert(int[] nums, int target) {
        
        if(nums.length<1){
            return 0;
        }
        searchInsert(nums,target,0,nums.length-1);
        return ans;
    }
    
    private void searchInsert(int[] nums,int target,int start,int end){
        
        if(start>end){
            return;
        }
       
        int mid=start + (end-start)/2;
        if(nums[mid]>target){
            
            searchInsert(nums,target,start,mid-1);
        }
        else if(nums[mid]<target){
            ans=mid+1;
            searchInsert(nums,target,mid+1,end);
        }
        else if(nums[mid]==target){
            ans=mid;
            searchInsert(nums,target,mid+1,end);
        }
        
        
    }
    
}