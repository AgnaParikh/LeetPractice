class DSU {
    int representative [];
    int size [];
    
    DSU(int sz) {
        representative = new int[sz];
        size = new int[sz];
        
        for (int i = 0; i < sz; ++i) {
            // Initially each group is its own representative
            representative[i] = i;
            // Intialize the size of all groups to 1
            size[i] = 1;
        }
    }
    
    // Finds the representative of group x
    public int find(int x) {
        if (x == representative[x]) {
            return x;
        }
        
        // This is path compression
        return representative[x] = find(representative[x]);
    }
    
    // Unite the group that contains "a" with the group that contains "b"
    public void Union(int a, int b) {
        int representativeA = find(a);
        int representativeB = find(b);
        
        // If nodes a and b already belong to the same group, do nothing.
        if (representativeA == representativeB) {
            return;
        }
        
        // Union by size: point the representative of the smaller
        // group to the representative of the larger group.
        if (size[representativeA] >= size[representativeB]) {
            size[representativeA] += size[representativeB];
            representative[representativeB] = representativeA;
        } else {
            size[representativeB] += size[representativeA];
            representative[representativeA] = representativeB;
        }
    }
}
class Solution {
    
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        
        if(accounts==null){
            return null;
        }
        
        DSU dsu = new DSU(accounts.size());
        
        //Map all email to their corresponding index
        Map<String,Integer> map=new HashMap<>();
        
        for(int i=0;i<accounts.size();i++){
            int accountSize=accounts.get(i).size();
            
            //avoid the email so start from j=1
            for(int j=1;j<accountSize;j++){
                
                String email = accounts.get(i).get(j);
                
                //If email is seen for the first time
                //Assign component group as the account index
                if(!map.containsKey(email)){
                    map.put(email,i);
                }
                else{
                    //If seen before union this with previous group
                    dsu.Union(i,map.get(email));
                }
                
            }
        }
        
        //Store emails corresponding to the component's representative
        
        Map<Integer,List<String>> components=new HashMap<Integer,List<String>>();
        
        for(String email:map.keySet()){
            int group=map.get(email);
            //Find representative of current email
            int groupRepresentative = dsu.find(group);
            
            if(!components.containsKey(groupRepresentative)){
                components.put(groupRepresentative,new ArrayList<String>());
            }
            
            components.get(groupRepresentative).add(email);
        }
        
        //Sort the components and create list of list
        List<List<String>> mergedAccounts=new ArrayList<>();
        
        for(int group : components.keySet()){
            List<String> componentEmails=components.get(group);
            Collections.sort(componentEmails);
            componentEmails.add(0,accounts.get(group).get(0));
            mergedAccounts.add(componentEmails);
        }
        
        return mergedAccounts;
            
            
        }
        
        
    }

