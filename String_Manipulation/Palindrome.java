package String_Manipulation;

public class Palindrome {

    private static String reverser(String s){

        String reversed = "";
        if(s.length() == 0){
            return reversed;
        }
        for(int i = s.length() - 1; i>=0;i--){
            reversed +=s.charAt(i);
        }
        return reversed;
    }
    public static boolean isPalindrome(String s){
        String t = reverser(s);
        return s.equals(t);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("wow"));
    }
}
