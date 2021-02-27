package String_Manipulation;

import java.util.*;
public class ReverseString {
    private String reverser(String s){

        String reversed = "";
        if(s.length() == 0){
            return reversed;
        }
        for(int i = s.length() - 1; i>=0;i--){
            reversed +=s.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {

        ReverseString reverse = new ReverseString();

        System.out.println(reverse.reverser("hello"));
        System.out.println(reverse.reverser(" "));
        System.out.println(reverse.reverser("Jain"));
    }

}
