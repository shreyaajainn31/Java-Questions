package trees;

public class builtTree {

    private class TreeNode{

        int data;
        TreeNode left, right;
        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    TreeNode root = null;

    private void insert(int data){

        TreeNode node = new TreeNode(data);
        if(root == null){
            root = node;
            return;
        }

        TreeNode curr = root;
        while(true){
            if(data < root.data){
               if(curr.left == null){
                   curr.left =  node;
                   break;
               }
               curr = curr.left;
            }
            else{
                if(curr.right == null){
                    curr.right = node;
                    break;
                }
                curr = curr.right;
            }

        }

    }

    public void inorder(){
        inorder(root);
    }

    private void inorder(TreeNode root){

        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public void preorder(){
        preorder(root);
    }

    private void preorder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(){
        postorder(root);
    }
    private void postorder(TreeNode root){

        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }


    public static void main(String[] args) {
        builtTree tree = new builtTree();
        tree.insert(5);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.inorder();
        System.out.println();
        tree.postorder();
        System.out.println();
        tree.preorder();
    }

}
