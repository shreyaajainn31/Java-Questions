package stacks;

import java.util.*;
import java.io.*;
import java.lang.*;
public class stackUsingArray<i> {

    int length;
    int array[];
    stackUsingArray(int length){
        this.length = length;
        //Emptying the array.
        array = new int[length];
        for(int i = 0; i<length; i++){
            array[i] = -1;
        }

    }

    int currCount = 0;
    public void push(int data){

        array[currCount] = data;
        currCount++;

        int newArray[] = new int[length * 2];

        for(int i = 0; i<newArray.length; i++){
            newArray[i] = -1;
        }

        if(currCount ==  length){

            for(int i = 0; i<length;i++){
                newArray[i] = array[i];
            }

            array = newArray;
        }
    }

    public void pop(){
        array[currCount - 1] = -1;

        try{
            if(currCount >= 0){
                currCount--;
            }
        }
        catch (Exception e){
            System.out.println("stack is empty");
        }

    }

    public int peek(){

        if(array[0] == -1){
            return -1;
        }
        else{
            int peekCount = currCount;
            while(peekCount >=0 && array[peekCount] == -1){
                peekCount--;
            }
            return array[peekCount];
        }
    }

    public void displayStack(){

        for(int i = array.length - 1; i>=0; i--){
            if(array[i] != -1){
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();
    }

    public boolean isEmpty(){

        if(array[0] == -1){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {

        stackUsingArray stack = new stackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        stack.pop();
        stack.push(30);
        stack.displayStack();
        stack.pop();
        stack.displayStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.displayStack();
        stack.pop();
        stack.pop();
        stack.displayStack();
        stack.pop();

    }

}
