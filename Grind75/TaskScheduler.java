public class TaskScheduler {
        public int leastInterval(char[] tasks, int n) {
            
            //Max heap
            PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b) -> b-a );
            
            //Queue with pair of [count,timeWhenAvailable]
            Queue<ForQueue> q=new LinkedList<>();
            int time=0;
            
            //Counter array
            int[] counter=new int[26];
            
            //Add counts to maxheap
            for(char c: tasks){
                counter[c-'A']++;
            }
            
            
            //Max heap with count
            for(int i=0;i<26;i++){
                if(counter[i]>0){
                    maxHeap.add(counter[i]);
                }
            }
            
            while(!maxHeap.isEmpty() || !q.isEmpty()){
            
                //increment time
                time+=1;
                
                if(!maxHeap.isEmpty()){
                    int count=maxHeap.poll()-1;
                    
                    if(count!=0){
                        
                        q.offer(new ForQueue(count,time+n));
                        //System.out.println("Queue "+q.toString());
                    }             
                    
                }
                
                if(!q.isEmpty() && q.peek().whenAvailable==time){
                    
                    maxHeap.add(q.poll().count);
                    
                }
            }
            
            return time;
            
        }
        
        
    }
    
    public class ForQueue{
        
        public int count;
        public int whenAvailable;
        
        public ForQueue(int count,int time){
            this.count=count;
            this.whenAvailable=time;
        }
        
        @Override
        public String toString(){
            return "["+count+","+whenAvailable+"]";
        }
}
