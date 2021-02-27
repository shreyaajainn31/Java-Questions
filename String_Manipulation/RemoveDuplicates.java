package String_Manipulation;

import java.util.*;
public class RemoveDuplicates {

    public static String removeDuplicates(String s){

        if(s == null){
            return s;
        }

        String removed = "";

        for(char c : s.toCharArray()){

            if(removed.indexOf(c) == -1){
                removed+=c;
            }
        }
        return removed;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("hello"));
        System.out.println(removeDuplicates("heeeeloooooooo!!!!!!!!"));
        System.out.println(removeDuplicates(null));

    }

}
