package queues;

import java.util.*;
public class queueUsingArray {

    int[] array = new int[5];

    int length = array.length;

    int front = -1, rear = -1, current = 0;
    private void add(int data){

            array[current] = data;
            front = 0;
            rear = current;
            current++;


    }

    private void remove(){
        if(front + 1 < length){
            front++;
        }
        else{
            front = -1;
        }
    }
    private boolean isEmpty(){
        if(front == -1){
            return true;
        }
        else{
            return false;
        }
    }
    private boolean isFull(){

        if(array[length - 1] == -1){
            return false;
        }
        else{
            return true;
        }

    }
    private int front(){
        if(front != -1)
            return array[front];
        else{
            return -1;
        }
    }

    private int rear(){

        if(rear!=-1)
            return array[rear];
        else{
            return -1;
        }

    }
    public static void main(String[] args) {

        queueUsingArray queue = new queueUsingArray();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue.rear());


    }
}
