public class ContainsDuplicate {

        public boolean containsDuplicate(int[] nums) {
            
            HashSet<Integer> record=new HashSet<>();
            
            for(int i=0;i<nums.length;i++){
                
                if(!record.contains(nums[i])){
                    record.add(nums[i]);                
                }
                else if(record.contains(nums[i])){
                    return true;
                }
            }
            
            return false;
            
        }
    }
