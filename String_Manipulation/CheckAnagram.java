package String_Manipulation;

import java.util.*;
public class CheckAnagram {

    private static String sortString(String sen){
        char[] sc = sen.toCharArray();
        Arrays.sort(sc);

       return new String (sc);
    }
    public static boolean checkAnagram(String s,String t){

        s = sortString(s);
        t = sortString(t);

        if(s.equals(t)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkAnagram("hello", "ehllo"));
        System.out.println(checkAnagram("ajskdf","askdf"));

    }

}
