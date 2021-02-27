package String_Manipulation;

import java.util.*;

public class ReverseOrderOfWords {
    private String reverseOrder(String s){

        String ans = "";

        if(s.length() == 0){
            return ans;
        }

        String [] strs = s.split(" ");

        for(int i = strs.length-1; i>=0; i--){
            ans+=strs[i];
            ans+=" ";
        }
        return ans;
    }

    public static void main(String[] args) {

        ReverseOrderOfWords reverser = new ReverseOrderOfWords();
        System.out.println(reverser.reverseOrder("Trees are Beautiful"));

    }
}
