package linkedList;

public class buildLinkedList {

    private static Node head;

    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private static void insertAtHead(int data){
        Node node = new Node(data);
        if(head == null){
           head = node;
        }
        else{
            Node temp = head;
            head = node;
            head.next = temp;
        }
    }
    private static void insertAtPos(int data, int pos){

        Node node = new Node(data);
        //Current linked list = 0 1 2 3 0 1 2
        //curr = head, temp
        //insert at pos 2; --> 0 data 1 2 3 0 1 2
        Node curr = head;
        for(int i = 0; i < pos - 2; i++){
            curr = curr.next; //curr = 0
        }
        Node temp;
        temp = curr.next;
        curr.next = node;
        node.next = temp;
    }
    private static void insertAtTail(int data){

        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }

        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = node;
    }

    private static void display(){
        if(head == null){
            System.out.println("list is empty.");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

     // insertAtHead(1);
     // insertAtHead(2);
     // insertAtHead(3);
      insertAtTail(0);
      insertAtTail(1);
      insertAtTail(2);
      insertAtHead(2);
      insertAtHead(1);
      insertAtHead(0);
      insertAtPos(3,4);
      display();

    }
}
