class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums==null || nums.length == 0)
        {
            return 0;
        }

        //Hashset
        //Note - use hashset when we need to extract unique values in O(1)
        HashSet<Integer> set = new HashSet<>();
        int ans = Integer.MIN_VALUE;

        //add all values from nums to hashset
        for(int num : nums)
        {
            set.add(num);
        }

        for(int i=0;i<nums.length; i++)
        {
            int curr_max = 1;
            int curr_num = nums[i];

            //Hashset does not contain left element of number line or num-1
            if(!set.contains(nums[i]-1))
            {
                while(set.contains(curr_num+1))
                {
                    curr_num = curr_num+1;
                    curr_max++;
                }
            }

            ans = Math.max(curr_max,ans);
        }

        return ans;

    }
}
