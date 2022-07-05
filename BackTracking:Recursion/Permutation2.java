public class Permutation2 {
    
    List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        ans=new ArrayList<List<Integer>>();
        
        ArrayList<Integer> res=new ArrayList<Integer>();
        
        for(int i : nums){
            res.add(i);
        }
        
        permuteUnique(nums,res,0);
                      
        return ans;            
                      
    }
    
    private void permuteUnique(int[] nums,ArrayList<Integer> res,int index){
        
        if(index==nums.length){
            if(!ans.contains(res)){
                ans.add(res);
            }
            return;
        }
        
        for(int i=index;i<nums.length;i++){
            
            //Do
            swap(res,index,i);
            //System.out.println(res.toString()+"Before swap");
            //Recurse
            permuteUnique(nums,new ArrayList<Integer>(res),index+1);
            //Undo
            swap(res,index,i);
            //System.out.println(res.toString()+"After swap");
        }
        
    }
    
    private void swap(ArrayList<Integer> res,int index,int i){
        int temp;
        
        if(i==index){
            return;
        }
        
        temp=res.get(index);
        res.add(index,res.get(i));
        res.remove(index+1);
        res.add(i,temp);
        res.remove(i+1);
    }
}
