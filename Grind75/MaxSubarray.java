public class MaxSubarray {
    
        //Dynamic Programming
        //O(nlogn)
        public int maxSubArray(int[] nums) {
            
            if(nums.length==0){
                return 0;
            }
            
            int sum=0;
            
            int max=Integer.MIN_VALUE;
            
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                
                if(sum<nums[i]){
                    sum=nums[i];
                }
                
                if(max<sum){
                    max=sum;
                }
            }
        
            return max;
            
        }
    
}
