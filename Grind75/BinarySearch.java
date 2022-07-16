public class BinarySearch {
    
        public int search(int[] nums, int target) {
            
            return binary(nums,0,nums.length-1,target);
            
        }
        
        private int binary(int[] nums,int start,int end,int target){
            
            int mid=start + (end-start)/2;
            
            if(start>end){
               return -1;
            }
            
            if(target==nums[mid]){
                return mid;
            }
            
            if(target<nums[mid]){
                return binary(nums,start,mid-1,target);
            }
            
            if(target>nums[mid]){
                return binary(nums,mid+1,end,target);
            }
            
            return mid;
            
        }
    }
