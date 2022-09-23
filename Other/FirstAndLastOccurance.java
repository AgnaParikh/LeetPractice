public class FirstAndLastOccurance {
    
        public int[] searchRange(int[] nums, int target) {
            
            //Find start position of target value
            int start = 0, end = nums.length-1;
            int[] res = new int[] {-1,-1};
            
            while(start <= end)
            {
                int mid = (start + end) / 2;
                if(target <= nums[mid])
                {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
                if(nums[mid] == target)
                    res[0] = mid;
            }
            
            //Find end position of target value
            start = 0;
            end = nums.length-1;
            while(start <= end)
            {
                int mid = (start + end) / 2;
                if(target >= nums[mid])
                {
                    start = mid + 1;                    
                }else{
                    end = mid - 1;
                }
                if(nums[mid] == target)
                    res[1] = mid;
            }
            return res;
        }
    
        
        /*List<Integer> ans;
        
        public int[] searchRange(int[] nums, int target) {
            
            ans=new ArrayList<>();
            int[] lt=new int[2];
            
            binarySearch(nums,0,nums.length-1,target);
            
            if(ans.size()==0){
                return new int[]{-1,-1};
            }
            Collections.sort(ans);
            lt[0]=ans.get(0);
            lt[1]=ans.get(ans.size()-1);
            
            return lt;
            
        }
        
        private int binarySearch(int[] nums,int start,int end,int target){
            
            if(start>end){
                return 0;
            }
            
            int mid=start+(end-start)/2;
    
            if(nums[mid]<target){
                return binarySearch(nums,mid+1,end,target);
            }
            
            else if(nums[mid]>target){
                return binarySearch(nums,start,mid-1,target);
            }
            if(nums[mid]==target){
                ans.add(mid);
            }
            if(mid+1<nums.length && nums[mid+1]==target){
                binarySearch(nums,mid+1,end,target);
            }
            else if(mid-1>-1 && nums[mid-1]==target){
                binarySearch(nums,start,mid-1,target);
            }
            
            return 0;
        }*/
    
}
