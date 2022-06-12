class MinStack {
    
    //Arraylist of stack integers
    public ArrayList<Integer> sk;
    //Arraylist of minimum integers
    public ArrayList<Integer> min;
    
    //Contructor method
    public MinStack() {
        sk=new ArrayList<Integer>();
        min=new ArrayList<Integer>();
        min.add(Integer.MAX_VALUE);
    }
    
    //Push to stack
    //time complexity: O(N) 
    public void push(int val) {
        
        if(val<=min.get(size(min)-1)){
            
            min.add(val);
            
        }
        sk.add(val);
        
    }
    
    //Time complexity O(n)
    //remove if last min element same as popped element
    public void pop() {
        
        System.out.println(min.get(this.size(min)-1)+" "+sk.get(this.size(sk)-1));
        if(min.get(this.size(min)-1).equals(sk.get(this.size(sk)-1))){
            
            min.remove(this.size(min)-1);
        }
        
         System.out.println("min "+min.toString());
        
        sk.remove(this.size(sk)-1);
        
        
    }
    
    //Return top of stack
    // O(n)
    public int top() {
        
        return sk.get(this.size(sk)-1);
    }
    
    //return top of min stack
    public int getMin() {
        
        //System.out.println("min "+min.toString());
        //System.out.println("sk "+sk.toString());
        
        return min.get(this.size(min)-1);
        
    }
    
    
    private int size(ArrayList<Integer> arr){
        
        return arr.size();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */