public class MajorityElement {

        public int majorityElement(int[] nums) {
           
            //Approch 1: Use HashMap
            //Time complexity: O(n)
            HashMap<Integer,Integer> count=new HashMap<>();
            int maxIndex=nums[0],max=0;
                    
            for(int i=0;i<nums.length;i++){
                
                System.out.println(count.toString());
                if(!count.containsKey(nums[i])){
                    count.put(nums[i],1);
                }
                else{
                    int x=count.get(nums[i]);
                    count.put(nums[i],++x);
                    //x++;
                    
                    if(max<x){
                        maxIndex=nums[i];
                        max=x;      
                        System.out.println(nums[i]+" "+max);
                    }
                }
            }
            
            return maxIndex;
            
        }
        
        //Approach 2
        // O(log n)
        /*
        1. sort the elements in monotonically increasing or decreasing order
        2. The majority element can be found at index floor (n/2) for n = odd and n/2-1 for n=even 
        */
}
