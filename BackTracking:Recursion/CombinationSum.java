public class CombinationSum {
    
        //Brute force
        List<List<Integer>> ans;
        
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            
            ans=new ArrayList<List<Integer>>();
            combinationSum(candidates,new ArrayList<Integer>(),0,0,target);
            
            return ans;        
            
        }
        
        private void combinationSum(int[] candidates,ArrayList<Integer> res,int index,int sum,int target){
            
            if(sum==target){
                ans.add(new ArrayList<>(res));
                return;
            }
            
            if(sum>target || index>=candidates.length){
                return;
            }
            
            System.out.println(res.toString());
            res.add(candidates[index]);
            combinationSum(candidates,res,index,sum+candidates[index],target);
            
            res.remove(res.size()-1);
            combinationSum(candidates,res,index+1,sum,target);
            
    }
}
    
