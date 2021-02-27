package String_Manipulation;

import java.util.*;
public class CountVowels {

    private int countVowels(String s){

        int count = 0;

        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'i' || c == 'o' || c == 'u' || c == 'e'){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountVowels count = new CountVowels();

        System.out.println(count.countVowels("hello"));
        System.out.println(count.countVowels("mstjyl"));

    }

}
