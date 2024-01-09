class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for(Integer a : asteroids)
        {
            while(!st.isEmpty() && a < 0 && st.peek() > 0)
            {
                int diff = a + st.peek();
                if(diff > 0)
                {
                    //Destroy a
                    a = 0;
                }
                else if(diff < 0)
                {
                    st.pop();
                }
                //if both are smae destroy both asteroids
                else{
                    st.pop(); a=0;
                }
            }

                if(a != 0)
                {
                    st.push(a);
                }
        }

        int[] ans = new int[st.size()];
        for(int i=st.size()-1; i >=0; i--)
        {
            ans[i] = st.pop();
        }
        
        return ans;
    }
}