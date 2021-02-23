package queues;

import java.util.*;
public class reversingAQueue {

    public static void reverseQueue(Queue<Integer>queue){

        Stack<Integer>stack = new Stack<>();

        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.add(stack.peek());
            stack.pop();
        }

    }
    public static void main(String[] args) {

        Queue<Integer>queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("queue before: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed queue: " + queue);
    }
}
