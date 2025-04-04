package Striver.BinaryTrees;

class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreePostorderTrav {

    public static void postOrderTrav(Node root){
        if (root == null) {
            return;
        }
        postOrderTrav(root.left);
        postOrderTrav(root.right);
        System.out.print(root.data + " ");
    }
    

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        postOrderTrav(root);
    }
}
