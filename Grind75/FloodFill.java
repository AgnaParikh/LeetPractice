public class FloodFill {
    
        //Breadth first search
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            
            if(image[sr][sc]==color){
                return image;
            }
            
            int[][] newFill=new int[image.length][image[0].length];
            
            for(int i=0;i<image.length;i++){
                
                for(int j=0;j<image[0].length;j++){
                    newFill[i][j]=image[i][j];
                }
            }
            
            BFS(image,newFill,sr,sc,color);
            
            return newFill;
                   
        }
        
        private int[][] BFS(int[][] image,int[][] newFill,int sr,int sc,int color){
            
            ArrayList<Integer> curr=new ArrayList<>();
            ArrayList<Integer> x;
            Queue<ArrayList<Integer>> t=new LinkedList<>();
            HashSet<ArrayList<Integer>> check=new HashSet<>();
            x=new ArrayList<>();
            x.add(sr);x.add(sc);
            t.add(new ArrayList<>(x));
            check.add(x);
            
            while(!t.isEmpty()){
                
                //Pop
                 curr=t.poll();
                
                
                //Add (r-1,c)
                if(curr.get(0)-1>=0 && image[curr.get(0)-1][curr.get(1)]==image[curr.get(0)][curr.get(1)] ){
                    x=new ArrayList<>();
                    x.add(curr.get(0)-1);
                    x.add(curr.get(1));
                    check.add(new ArrayList<>(x));
                    t.add(new ArrayList<>(x));
                }
                
                //Add(r+1,c)
                if(curr.get(0)+1<image.length && image[curr.get(0)+1][curr.get(1)]==image[curr.get(0)][curr.get(1)]){
                    x=new ArrayList<>();
                    x.add(curr.get(0)+1); x.add(curr.get(1));
                    
                    if(!check.contains(x)){
                        check.add(new ArrayList<>(x));
                        t.add(new ArrayList<>(x));
                    }
    
                }
                
                                                            
                if(curr.get(1)-1>=0 && image[curr.get(0)][curr.get(1)-1]==image[curr.get(0)][curr.get(1)]){
                    x=new ArrayList<>();
                    x.add(curr.get(0)); x.add(curr.get(1)-1);
                    
                    if(!check.contains(x)){
                        check.add(new ArrayList<>(x));
                        t.add(new ArrayList<>(x));
                    }
                    
                }
                
                if(curr.get(1)+1<image[0].length && image[curr.get(0)][curr.get(1)+1]==image[curr.get(0)][curr.get(1)]){                                        
                    x=new ArrayList<>();
                    x.add(curr.get(0)); x.add(curr.get(1)+1);
                    
                    if(!check.contains(x)){
                        check.add(new ArrayList<>(x));
                        t.add(new ArrayList<>(x));
                    }
                    
                }
                
                System.out.println(t.toString() +"   "+check.toString());
                System.out.println(curr.toString());
                
                //Change color
                newFill[curr.get(0)][curr.get(1)]=color;
                
                
            }
            
            return newFill;
        } 
    }
}
