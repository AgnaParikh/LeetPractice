public class MyQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    
    public MyQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();        
    }
    
    public void push(int x) {
        
        if(stack1.isEmpty()){
            front=x;
        }
        
        stack1.push(x);
        
    }
    
    public int pop() {
        
        int ans;
        
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        
        ans=stack2.pop();
        
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
                
        return ans;
                                        
    }
    
    public int peek() {
        
        int ans;
        
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        
        ans=stack2.peek();
        
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        
        return ans;
        
    }
    
    public boolean empty() {
        
        return stack1.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */ 
    
