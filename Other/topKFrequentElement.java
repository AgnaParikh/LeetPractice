public class topKFrequentElement {
        public int[] topKFrequent(int[] nums, int k) {
    
            //PriorityQueue<int[]> heap = new PriorityQueue<>(intervals.length, (a,b) -> Integer.compare(a[1],b[1]));
            PriorityQueue<int[]> ans = new PriorityQueue<>((a,b) -> b[1] - a[1]);
            int[] result = new int[k];
            //key: count
            //value : number
            HashMap<Integer,Integer> count = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                count.put(nums[i],count.getOrDefault(nums[i],0)+1);
            }
            System.out.println(count.toString());
    
            for(Integer y : count.keySet()){
                ans.add(new int[]{y,count.get(y)});
            }
    
            for(int i=0;i<k;i++){
                result[i]=ans.poll()[0];
            }
    
            return result;
            
        }
    
}
