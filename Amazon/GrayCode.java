class Solution {
    public List<String> getCode(int n) {
        
        //Base case
        if(n==1){
            List<String> temp=new ArrayList<>();
            temp.add("0"); temp.add("1");
            return temp;
        }
        
        //List ans from previous recursive call
        List<String> tmp=new ArrayList<>(getCode(n-1));
        
        //At every recursive level new list generated and 'ans' is stored
        List<String> ans=new ArrayList<>();
        
        //Append '0' at beginning [0,1] -> [00,01]
        for(int i=0;i<tmp.size();i++){
            ans.add("0"+tmp.get(i));
        }
        
        //Reverse order of tmp
        //Add 1 in the beginning [0,1] --> [10,11]
        for(int i=tmp.size()-1;i>=0;i--){
            ans.add("1"+tmp.get(i));
        }
        
        return ans;
        
    }
    
    public List<Integer> grayCode(int n) {
        
        List<String> stringCode=new ArrayList<>(getCode(n));
        List<Integer> grayCode=new ArrayList<>();
        
        for(int i=0;i<stringCode.size();i++) 
        {
            grayCode.add(Integer.parseInt(stringCode.get(i),2));
        }
        
        return grayCode;
    }
}