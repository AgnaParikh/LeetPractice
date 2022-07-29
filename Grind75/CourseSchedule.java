public class CourseSchedule {
    
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            
            HashMap<Integer,ArrayList<Integer>> prereq = new HashMap<Integer,ArrayList<Integer>>();
            boolean[] visited = new boolean[numCourses];
            
            for(int i=0;i<numCourses;i++){
                prereq.put(i,new ArrayList<Integer>());
            }
            
            
            for(int i=0;i<prerequisites.length;i++){
                
                ArrayList<Integer> ans=new ArrayList<Integer>();
                
                if(prereq.containsKey(prerequisites[i][0])){
                    ans=prereq.get(prerequisites[i][0]);
                    ans.add(prerequisites[i][1]);
                    prereq.put(prerequisites[i][0],ans);
                }
                
                //System.out.println(prereq.toString());
                
            }
            
            
            
            for(int i=0;i<numCourses;i++){
                
                if(prereq.containsKey(i)){
                    
                    if(!DFS(i,prereq,visited)){
                        return false;
                    }
                }
    
            }
            
            return true;
            
        }
        
        private boolean DFS(int node,HashMap<Integer,ArrayList<Integer>> prereq,boolean[] visited ){
            
    
            if(prereq.get(node).size()==0){
                return true;
            }
            
            if(visited[node]==true){
                return false;
            }
            
            visited[node]=true;
            
            for(int x : prereq.get(node)){
                    if(!DFS(x,prereq,visited)){
                        return false;
                    }            
            }
            
            visited[node]=false;
            
            prereq.put(node,new ArrayList<Integer>());
            
            return true;
        }
        
        
    }
