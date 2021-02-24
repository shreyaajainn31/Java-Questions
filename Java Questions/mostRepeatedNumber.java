package hashMaps;

import java.util.*;

public class mostRepeatedNumber {

    private int findMostRepeated(int[]nums){

        Map<Integer,Integer> map = new HashMap<>();

        for(int num: nums){

            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num,1);
            }
        }

        int ans = -1;
        for(int num : map.keySet()){
            if(ans < map.get(num)){
                ans = map.get(num);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        mostRepeatedNumber finder = new mostRepeatedNumber();

        int nums[] = {1,2,2,3,3,3,4};

        System.out.println(finder.findMostRepeated(nums));
    }
}
