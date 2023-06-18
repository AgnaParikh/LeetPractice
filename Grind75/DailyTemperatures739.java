class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] ans = new int[temperatures.length];
        //Stack stores index
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<temperatures.length; i++)
        {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
            {
                int prev = stack.pop();
                //add number of days to poped index
                ans[prev] = i - prev;
            }

            stack.push(i);
        }     

        return ans;   

    }
}
