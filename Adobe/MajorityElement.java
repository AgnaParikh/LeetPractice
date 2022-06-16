public class MajorityElement {
    
    class Solution {
        public int majorityElement(int[] nums) {
            
            HashMap<Integer,Integer> ans=new HashMap<>();
            int max=0;
            int val=nums[0];
            
            //Time complexity: O(n)
            //Space complexity: O(n)
            for(int i=0;i<nums.length;i++){
                
                if(!ans.containsKey(nums[i])){
                    ans.put(nums[i],1);
                }
                else{
                    int x=ans.get(nums[i]);
                    ans.put(nums[i],x+1);
                }
            }
            
            for(int k : ans.keySet() ){
                if(ans.get(k)>max){
                    max=ans.get(k);
                    val=k;
                }
            }
            
            return val;
            
        }
        
        /** APPROACH 2: O(nlogn)
        
            public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length/2];
        }
        **/
    }
}
