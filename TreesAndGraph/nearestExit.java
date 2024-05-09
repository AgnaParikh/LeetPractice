class Solution {
    boolean[][] isVisited;
    public int nearestExit(char[][] maze, int[] entrance) {

        int ans = -1;
        isVisited = new boolean[maze.length][maze[0].length];
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(entrance[0], entrance[1],-1));

        while(!queue.isEmpty())
        {
            Pair current = queue.poll();
            System.out.println(current.x+" "+current.y+" "+current.step);

            if(current.x >= maze.length || current.x < 0 || current.y >= maze[0].length || current.y < 0 || isVisited[current.x][current.y])
            {
                continue;
            }

            isVisited[current.x][current.y] = true;
            if(maze[current.x][current.y] == '+')
            {
                continue;
            }

            if(!(current.x == entrance[0] && current.y == entrance[1]) && isBorder(current.x,current.y, maze.length,maze[0].length))
            {
                return current.step+1;
            }

            else{
                queue.add(new Pair(current.x+1,current.y, current.step+1));
                queue.add(new Pair(current.x-1,current.y, current.step+1));
                queue.add(new Pair(current.x,current.y+1, current.step+1));
                queue.add(new Pair(current.x,current.y-1, current.step+1));

            }

        }

        return ans;

        
    }

    private boolean isBorder(int row, int col, int rowLen, int colLen)
    {
        if(row+1 == rowLen || col+1 == colLen || row == 0 || col == 0)
        {
            return true;
        }

        return false;
    }
}

class Pair{

    public int x;
    public int y;
    public int step;

    public Pair(int x,int y, int step)
    {
        this.x = x;
        this.y = y;
        this.step = step;
    }
}