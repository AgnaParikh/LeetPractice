class PolishEvaluation {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                stack.push(evaluate(tokens[i],stack.pop(),stack.pop()));
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        
        return stack.pop();
        
    }
    
    private int evaluate(String operator,int a,int b){
        
        int ans=-1;
        
        switch(operator){
                
            case "+": 
                ans=a+b;
                break;
            
            case "-":
                ans=b-a;
                break;
                
            case "*":
                ans=a*b;
                break;
            
            case "/":
                ans=b/a;
                break;
                
            default:               
        }
        return ans;
    }
}
