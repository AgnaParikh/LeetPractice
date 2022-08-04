class Permutation {
    
    List<List<Integer>> ans;
    
    public List<List<Integer>> permute(int[] nums) {
        
        ans=new ArrayList<List<Integer>>();
        //Base case
        if(nums.length==0){
            return ans;
        }
        
        permute(nums,new ArrayList<Integer>());
        
        return ans;
        
    }
    
    private void permute(int[] nums,ArrayList<Integer> res){
        
        if(res.size()==nums.length){
            ans.add(res);
            return;
        }
        
        System.out.println(res.toString());
        
        for(int i=0;i<nums.length;i++){
            
            if(!res.contains(nums[i])){
                res.add(nums[i]);
                permute(nums,new ArrayList<Integer>(res));
                res.remove(res.size()-1);
            }
            else{
                continue;
            }

        }
    }
}
