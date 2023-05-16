//2367. Number of Arithmetic Triplets

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {

        int res=0;
        //Hashmap with key - number and value - index
        HashMap<Integer,Integer> values = new HashMap<>();

        for(int i = 0; i < nums.length ; i++){
            values.put(nums[i],i);
        }

        for(int i=0;i<nums.length; i++){
            int x = 2*diff + nums[i];
            int y = diff + nums[i];
            if(values.containsKey(x) && values.containsKey(y))
            {
                res++;
            }
        }

        return res;  
    }
}