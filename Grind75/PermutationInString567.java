class Solution {
    public boolean checkInclusion(String s1, String s2) {
                if(s1.length() ==0 || s2.length() < s1.length())
        {
            return false;
        }

        HashMap<Character,Integer> mapS1 = new HashMap<>();
        HashMap<Character,Integer> mapS2 = new HashMap<>();
        int left = 0, right = 0;

        //create values from string 1 to hashmap 1
        for(char x : s1.toCharArray())
        {
            mapS1.put(x, mapS1.getOrDefault(x,0)+1);
        }

        //create first sliding window and hashmap
        while(right - left < s1.length())
        {
            mapS2.put(s2.charAt(right),mapS2.getOrDefault(s2.charAt(right),0)+1);
            right++;
        }

        while( left <= right && right < s2.length())
        {
            if(mapS1.equals(mapS2))
            {
                return true;
            }

            mapS2.put(s2.charAt(right),mapS2.getOrDefault(s2.charAt(right),0)+1);
            if(mapS2.containsKey(s2.charAt(left)))
            {
                mapS2.put(s2.charAt(left),mapS2.get(s2.charAt(left))-1);

                if(mapS2.get(s2.charAt(left)) == 0) 
                {
                    mapS2.remove(s2.charAt(left));
                }
            }

            //Slide window by moving left and right pointer by 1
            left++;
            right++;

        }

        return mapS1.equals(mapS2);
    }
}