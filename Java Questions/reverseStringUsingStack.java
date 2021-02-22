package stacks;

import  java.util.*;

public class reverseStringUsingStack {

    public String reverseString(String s){

        Stack<Character>stack = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }

        String ans = "";
        while(!stack.isEmpty()){
            ans+=stack.peek();
            stack.pop();
        }
        return ans;
    }
    public static void main(String[] args) {

        String s = "shreya";

        reverseStringUsingStack solution = new reverseStringUsingStack();

        System.out.println(solution.reverseString(s));
    }
}
