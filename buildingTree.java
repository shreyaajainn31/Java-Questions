package trees;

public class buildingTree {

    class Node{

        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root = null;
    public Node insert(Node root, int data){

        Node n = new Node(data);
        if(root == null){
            root = n;
            return root;
        }

        else if(root.data > data){
            root.left = n;
        }
        else {
            root.right = n;
        }

        return root;
    }
    public void display(Node root){
        System.out.print(root.data + " ");
        root = root.left;
        root = root.right;
    }

    public static void main(String[] args) {

        Node root = new Node(null);
        insert(root, 1);
        insert(root,3);
        insert(root,4);
        insert(root,3);
        display(root);
    }


}
