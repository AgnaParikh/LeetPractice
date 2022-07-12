public class SortColors {
        public void sortColors(int[] nums) {
            
            //Brute force
            HashMap<Integer,Integer> count=new HashMap<>();
            
            //Have count of each key
            for(int i=0;i<nums.length;i++){
                
                if(!count.containsKey(nums[i])){
                    count.put(nums[i],1);
                }
                else{
                    int x=count.get(nums[i]);
                    count.put(nums[i],++x);
                }
            }
            
            //Override array
            int j=0;
            for(int x: count.keySet()){
                
                int y=count.get(x);
                
                for(int i=0;i<y;i++){
                    nums[j]=x;
                    j++;
                }
            }
            
        }
    
}
