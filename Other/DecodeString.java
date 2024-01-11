class Solution {
    public String decodeString(String s) {

        Stack<String> st = new Stack<>();
        String ans = "";
        String str = "";

        for(Character i : s.toCharArray())
        {
            //Push to stack for each non-closing character
            if(i != ']')
            {
                st.push(Character.toString(i));
            }
            //closing bracket character found
            else {
                str = "";
                //pop and create a substring for until opening bracket is found
                while(!st.peek().equals("["))
                {
                    str = st.pop() + str;
                }

                //pop opening character
                st.pop();

                //after an opening bracket, get a number
                String k = "";
                while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0)))
                {
                    k = st.pop()+k;
                }
                int d = (Integer.parseInt(k));
                st.push(str.repeat(d));
            }
        }

        while(!st.isEmpty())
        {
            ans = st.pop() + ans;
        }
        
        return ans;
    }
}