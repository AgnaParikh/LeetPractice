
class Solution {

    static class ReverseComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer num1, Integer num2) {
                return num2.compareTo(num1); // Compare in reverse order
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {

        HashMap<Integer,Integer> positionSpeed = new HashMap<>();
        Stack<Double> time = new Stack<>();

        //Add speed and position to hashmap
        for(int i = 0; i<position.length; i++)
        {
            positionSpeed.put(position[i],speed[i]);
        }

        //Sort positions from closest to target 
        Arrays.sort(position);

        for(int i=position.length-1; i>=0; i--)
        {
            //time = distance travelled / speed
            double timeForCurrent = (double) (target - position[i])/positionSpeed.get(position[i]);
            
            if(time.isEmpty()){
                time.push(timeForCurrent);
            }
            //As vehicles that takes lesser time than top forms a fleet
            else if(!time.isEmpty() && time.peek() < timeForCurrent)
            {
                time.push(timeForCurrent);
            }
        }

        return time.size();

        
    }
}
