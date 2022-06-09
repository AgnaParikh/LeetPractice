/**

VALID PARENTHESIS

Ascii difference between :
'(' and ')' = 1
'{' and '}' = 2
'[' and ']' = 2
Steps: 1. Declare a stack. if stack is empty keep pushing characters of string
2. Pop if ascii difference between (top of stack and current string character ==1 or 2).
3. in the end if stackis empty, all brackets matched and parenthesis is valid else not valid
**/

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> closingStack = new Stack<Character>();
        
        for(int i=s.length()-1;i>-1;i--){
            
            if(s.charAt(i)=='[' || s.charAt(i)=='(' || s.charAt(i)=='{'){
                //Opening pop from stack and check if valid
                    if(!closingStack.empty()){
                        char x = closingStack.pop();
                        if(!checkValid(x,s.charAt(i))){
                            return false;
                    }
                }
                else{
                    return false;
                }
                

            }
            else if(s.charAt(i)==']' || s.charAt(i)==')' || s.charAt(i)=='}'){
                closingStack.push(s.charAt(i));
            }
        }
        
        if(!closingStack.empty()){return false;}
        
        return true;
        
    }
    
    private boolean checkValid(char close,char open){
        
        boolean ans;
        ans=false;
        
        if(open=='(' && close==')'){
            ans=true;
        }
        else if(open=='[' && close==']'){
            ans=true;
        }
        else if(open=='{' && close=='}'){
            ans=true;
        }
        
        return ans;
    }

    public boolean isValid1(String s) 
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!st.isEmpty() && (st.peek()==c-1 || st.peek()==c-2)) // check ascii diff. =1or 2
                st.pop();
            else st.push(c);
        }
        if(st.isEmpty()) return true; // valid parenthesis
        return false;
    }


}