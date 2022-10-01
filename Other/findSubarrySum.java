public class findSubarrySum {
        public boolean findSubarrays(int[] nums) {
            
            if(nums.length<3){
                return false;
            }
            
            ArrayList<Integer> sums=new ArrayList<>();
            
            int i=0,j=0;
            int sum=0;
            
            while(j<2){
                sum+=nums[j];
                j++;
            }
            
            sums.add(sum);
            
            while(j<nums.length){
                
                sum+=(nums[j]-nums[i]);
                
                j++;
                i++;
                
                if(sums.contains(sum)){
                    return true;
                }
                
                else{
                    sums.add(sum);
                }
            }
            
            return false;
            
        }
    
}
