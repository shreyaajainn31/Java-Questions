package linkedList;

import java.util.List;

public class myLinkedList {

    public static class ListNode{
        public ListNode next;
        int data;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    private static ListNode first;
    private  static ListNode last;

    static ListNode head = null;

    //addFirst, addLast, deleteFirst, deleteLast, contains, indexOf

    public static void addFirst(int data){

        ListNode node = new ListNode(data);

        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }

    }

    public static void addLast(int data){

        ListNode node = new ListNode(data);

        if(head == null){
            addFirst(data);
        }

        ListNode curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }

        curr.next = node;


    }
    public static void display(){
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static boolean contains(int data){
        ListNode curr = head;

        boolean ans = false;

        while(curr != null){
            if(curr.data == data){
               return true;
            }
            curr = curr.next;
        }

        return false;
    }

    public static int indexOf(int data){

        int index = 0;

        int ans = -1;

        ListNode curr = head;
        while(curr!= null){
            index++;
            if(curr.data == data){
                ans = index - 1;
                return index - 1;
            }
            curr = curr.next;
        }

        return -1;


    }
    public static void deleteFirst(){

        if(head.next == null){
            head = null;
        }

        head = head.next;
    }

    public static void deleteLast(){

        ListNode curr = head;
        while(curr.next.next!= null){
            curr = curr.next;
        }

        curr.next = null;

    }
    public static void main(String[] args) {

        addFirst(10);
        addLast(20);
        addLast(30);
        addLast(40);
        addLast(50);
        addLast(60);
        addLast(70);
        display();
        deleteLast();
        display();
        deleteFirst();
        display();
        System.out.println(contains(50));
        System.out.println(indexOf(50));
    }





}
