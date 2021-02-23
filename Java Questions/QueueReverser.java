package queues;

import java.util.*;
public class QueueReverser {

    public void reverser(Queue<Integer>queue, int k){

        Stack <Integer> stack = new Stack<>();
        Queue<Integer> queue2 = new LinkedList<>();
        while(k!=0){
            stack.add(queue.remove());
            k--;
        }
        while(!stack.isEmpty()){
           // System.out.println(stack.peek());
            queue2.add(stack.pop());
        }

        while(!queue.isEmpty()){
            queue2.add(queue.remove());
        }

        while(!queue2.isEmpty()){
            System.out.print(queue2.remove() + " ");
        }

    }

    public static void main(String[] args) {
        QueueReverser reverse  = new QueueReverser();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);


        System.out.println();
        reverse.reverser(queue, 3);

    }
}
