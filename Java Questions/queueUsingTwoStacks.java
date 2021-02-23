package queues;

import java.util.*;
public class queueUsingTwoStacks {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void add(int data){
        stack1.push(data);
    }

    public int rear(){

        if(!stack1.isEmpty())
            return stack1.peek();
        else{
            throw new IllegalStateException("The stack is empty!");
        }
    }

    public int front(){

        if(stack1.isEmpty()){
            throw new IllegalStateException("The stack is empty!");
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.peek());
            stack1.pop();
        }
        int ans = stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.peek());
            stack2.pop();
        }

        return ans;
    }
    public void remove(){

        if(stack1.isEmpty()){
            throw new IllegalStateException("The stack is Empty!");
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.peek());
            stack1.pop();
        }

        stack2.pop();

        if(stack2.isEmpty()){
            return;
        }

        while(!stack2.isEmpty()){
            stack1.push(stack2.peek());
            stack2.pop();
        }
    }


    public static void main(String[] args) {
        queueUsingTwoStacks queue = new queueUsingTwoStacks();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue.front());
        queue.remove();
        System.out.println(queue.front());

    }

}
