
class TimeValue {
    int timestamp;
    String val;
    
    public TimeValue(int timestamp, String val){
        this.timestamp = timestamp;
        this.val = val;
    }
}

class TimeMap {
    
    private HashMap< String, ArrayList<TimeValue>> database; 
    
    public TimeMap() {
        this.database = new HashMap< String, ArrayList<TimeValue> >();
    }
    
    public void set(String key, String value, int timestamp) {
        TimeValue timevalue = new TimeValue(timestamp, value);
        
        if (!database.containsKey(key)){
            database.put(key, new ArrayList<>());
        }
        database.get(key).add(timevalue);
    }
    
    public String get(String key, int timestamp) {
        String res = "";
        ArrayList<TimeValue> values = database.getOrDefault(key, new ArrayList<>());
        
        int l = 0;
        int r = values.size()-1;
        
        while (l<=r){
            int m = (l+r) / 2;
            if (values.get(m).timestamp <= timestamp){
                res = values.get(m).val;
                l = m + 1;
            }
            else
                r = m - 1;
        }
        return res;
        
    }
}
//Approach 1: HashMap of HashMap
/*class TimeMap {
    
    HashMap<String,HashMap<Integer,String>> Storage;

    public TimeMap() {
        
        this.Storage=new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        
        HashMap<Integer,String> ans;
        
        if(!this.Storage.containsKey(key)){
            ans=new HashMap<>();
            ans.put(timestamp,value);
            this.Storage.put(key,ans);
        }
        else{
            ans=this.Storage.get(key);
            ans.put(timestamp,value);
            this.Storage.put(key,ans);
        }
        
    }
    
    public String get(String key, int timestamp) {
        
        String ans="";
        int currMax=-1;

        if(this.Storage.get(key).get(timestamp)!=null){
            return this.Storage.get(key).get(timestamp);
        }
            
        ArrayList<Integer> keys = new ArrayList<Integer>(this.Storage.get(key).keySet());
        //Collections.sort(keys);
        System.out.println(Storage.toString());
        System.out.println(keys.toString());
        
        //Apply binary Search
        int left=0,right=keys.size()-1;
        while(left<=right){
            
            int mid=left+(right-left)/2;
            
            if(keys.get(mid)<=timestamp){
                
                ans=this.Storage.get(key).get(keys.get(mid));
                //currMax=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        
        return ans;

        }
        
    }
*/

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */