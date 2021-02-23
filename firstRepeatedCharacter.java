package hashMaps;

import java.util.*;
public class firstRepeatedCharacter {

    public char firstRepeated(String s){

        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){

            if(c!=' ') {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }

        for(char c : s.toCharArray()){
            if(c!= ' ' && map.get(c) >= 2){
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {

        firstRepeatedCharacter finder = new firstRepeatedCharacter();

        System.out.println(finder.firstRepeated("green apple"));
    }

}
