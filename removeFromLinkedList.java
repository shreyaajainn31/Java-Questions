package linkedList;

public class removeFromLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;

    static void insertAtHead(int data){

        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        else{
            Node temp = head;
            head = node;
            node.next = temp;
        }
    }
    static void display(Node head){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    static void remove(int data){

        if(head == null){
            System.out.println("List is empty.");
            return;
        }
       // 1. remove at head
        if(head.data == data){
            head = head.next;
            return;

        }
       // 2. remove in between

        Node currNode = head;

        while(currNode.next.data!=data){
            currNode = currNode.next;
        }

        if(currNode.next.next!=null){
            currNode.next = currNode.next.next;
            return;
        }

       // 3. remove at tail
        else{
            currNode.next = null;
        }
    }
    public static void main(String[] args) {

       // insertAtHead(5);
        insertAtHead(4);
        insertAtHead(3);
        insertAtHead(2);
        insertAtHead(1);
        display(head);
        remove(1);

        System.out.println("removing head");
        display(head);

        System.out.println("removing tail");
        remove(4);
        display(head);

        System.out.println("removing in between");

        insertAtHead(5);
        insertAtHead(6);
        remove(5);
        display(head);

        remove(6);
        remove(2);
        remove(3);
        display(head);

    }

}
