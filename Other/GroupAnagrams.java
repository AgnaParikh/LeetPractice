public class GroupAnagrams {
    
        public List<List<String>> groupAnagrams(String[] strs) {
    
            HashMap<String,List<String>> ans=new HashMap<>();
            ArrayList<List<String>> result=new ArrayList<>();
    
            for(int i=0;i<strs.length;i++){
                char[] c = strs[i].toCharArray();
                Arrays.sort(c);
                String x = String.valueOf(c);
    
                if(!ans.containsKey(x)){
                    ans.put(x,new ArrayList<>());
                }
                List<String> l = ans.get(x);
                l.add(strs[i]);
                ans.put(x,l);
            }
    
            for(String x : ans.keySet()){
                result.add(ans.get(x));
            }
    
            return result;
            
        
    }
}
