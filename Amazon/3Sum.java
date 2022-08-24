class 3Sum {
    
    //O(n^2)
    //Three summ using 2 pointer method    
    List<List<Integer>> ans;
        
    public List<List<Integer>> threeSum(int[] nums) {
        
        ans = new ArrayList<List<Integer>>();
        
         //Sort array to avoid duplicates
         Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            
            //Avoid duplicates
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            
            twoSum(nums,i);
            
        }
        
        return ans;
        
    }
    
    private void twoSum(int[] nums,int i){
        
        int left=i+1;
        int right=nums.length-1;
        int sum=0;
        
        while(left<right){
                       
            sum=nums[left]+nums[right]+nums[i];
            
            if(sum>0){
                right-=1;
            }
            else if(sum<0){
                left+=1;
            }
            else{
                ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
            }
        }
    }
}
    