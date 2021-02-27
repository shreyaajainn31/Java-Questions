package String_Manipulation;

import java.util.*;

public class Capitalize {

    public static String capitalize(String s){

        if(s.length() == 0){
            return s;
        }
        String[] words = s.split(" ");

        StringBuilder capitaled = new StringBuilder();
        for(String w : words){
            char c = Character.toUpperCase(w.charAt(0));
            StringBuilder newWord = new StringBuilder();
            newWord.append(c);
            for(int i = 1; i<w.length(); i++){
                newWord.append(w.charAt(i));
            }

            capitaled.append(newWord);
            capitaled.append(" ");
        }

        return capitaled.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(capitalize("trees are beautiful"));
        System.out.println(capitalize("hello from the other sideeeeeeeeeeee"));
    }
}
