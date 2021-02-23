package hashMaps;

import java.util.*;
public class firstNonRepeatedCharacter {
    public char findFirst(String s){

        Map<Character,Integer> map  = new HashMap<>();

        for(char c : s.toCharArray()){

            if(c != ' '){
                if(map.containsKey(c)){
                    map.put(c, map.get(c) + 1);
                }
                else{
                    map.put(c, 1);
                }
            }
        }


        for(char c : s.toCharArray()){
            if(c!= ' ' && map.get(c) == 1){
                return c;
            }
        }


        return '\0';
    }

    public static void main(String[] args) {

        String s = "a green apple";

        firstNonRepeatedCharacter finder = new firstNonRepeatedCharacter();
        System.out.println(finder.findFirst(s));
    }
}
