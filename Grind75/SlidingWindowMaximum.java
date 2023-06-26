class Solution239{
    public int[] maxSlidingWindow(int[] nums, int k) {

        //Deque data structure
        //double ended queue
        Deque<Integer> q = new LinkedList<>(); //Stores indices
        int left = 0, right = 0;
        int m=0;

        //number of widnows = n-k+1
        int[] ans = new int[nums.length - k + 1];

        while(right < nums.length)
        {
            //if first element is index of left ptr
            if(!q.isEmpty() && left > q.peekFirst())
            {
                q.pollFirst();
            }
           
            //This condition will create a monotonically decreaing queue
            while(!q.isEmpty() && nums[right] > nums[q.peekLast()] )
            {
                q.pollLast();
            }
            q.offer(right);

            //fix first window
            if(right + 1 >= k)
            {
                ans[m++] = nums[q.peekFirst()];
                left++;
            }
            right++;
        }

        return ans;

    }
}