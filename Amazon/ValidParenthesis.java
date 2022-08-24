class ValidParenthesis {
    public boolean isValid(String s) {
        
        HashMap<Character,Character> map=new HashMap<>();
        
        if(s.length()%2!=0){
            return false;
        }
        
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        Stack<Character> opening=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            char curr=s.charAt(i);
            
            if(curr=='(' || curr=='[' || curr=='{'){
                opening.push(curr);
            }
            //if closing pop
            else if(map.containsKey(curr)){

                if(opening.isEmpty() || opening.pop()!=map.get(curr)){
                    return false;
                }
            }           
        }
        
        if(!opening.isEmpty()){
            return false;
        }
        
        return true;
        
    }
}