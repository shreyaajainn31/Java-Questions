package String_Manipulation;

import java.util.*;
public class MostRepeatedChar {

    public static Character findMostRepeated(String s){

        if(s.length() == 0){
            return '\0';
        }

        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c,1);
            }
        }

        int currentMax = 0;
        for(char c : map.keySet()){

            if(currentMax < map.get(c)){
                currentMax = map.get(c);
            }

        }

        for(char c : map.keySet()){
            if(map.get(c) == currentMax){
                return c;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        System.out.println(findMostRepeated("helloooooo"));

    }
}
