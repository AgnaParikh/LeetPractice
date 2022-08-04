public class Subsets {

    List<List<Integer>> result;
    
    public List<List<Integer>> subsets(int[] nums) {
        
        if(nums.length==0){
            return new ArrayList<>();
        }
        
        result=new ArrayList<>();
        
        permute(nums,0,new ArrayList<Integer>());
        
        return result;
    }
    
    private void permute(int[] nums,int level,ArrayList<Integer> list){
        
        if(level>=nums.length){
            result.add(list);
            return;
        }
        
        //Add value at index level
        list.add(nums[level]);
        permute(nums,level+1,new ArrayList<Integer>(list));
        
        //Remove and recurse
        list.remove(list.size()-1);
        permute(nums,level+1,new ArrayList<Integer>(list));
    }
    
}
