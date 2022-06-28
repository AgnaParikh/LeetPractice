public class ContainsDuplicate2 {
    // Approach 1: O(n^2) FAILS'
    /*
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++){
            
            for(int j=i+1;j<nums.length;j++){
                
                if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                    System.out.println(i+" "+j);
                    return true;
                }
            }
        }
        
        return false;
        
    }*/
    
    //Approach 2: Using hashmap
    // Possible time complexity O(n)
    public boolean containsNearbyDuplicate(int[] nums, int k){
        
        HashMap<Integer,Integer> addValues=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(addValues.containsKey(nums[i])){
                if(Math.abs(i-addValues.get(nums[i]))<=k){
                    return true;
                }
                
            }
            
                addValues.put(nums[i],i);
            
        }
        
        return false;
    }
}
