public class XORSubsets {
    
    //Symbol of XOR = ^
    // Time complexity O(n*2^n)
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        
        ans=new ArrayList<List<Integer>>();
        int index=0;
        
        subsets(index,nums,new ArrayList<Integer>());
        System.out.println(ans.toString());
        return ans;
    }
    
    private void subsets(int index,int[] nums,ArrayList<Integer> set){
        
        if(index==nums.length){
            System.out.println(ans.toString());
            ans.add(set);
            return;
        }
        
        ArrayList<Integer> set1=new ArrayList<Integer>(List.copyOf(set));
            set1.add(nums[index]);       
        subsets(index+1,nums,set1);
        
        
        ArrayList<Integer> set2=new ArrayList<Integer>(List.copyOf(set));          
        subsets(index+1,nums,set2);
        
        //return ans;
    }
}

