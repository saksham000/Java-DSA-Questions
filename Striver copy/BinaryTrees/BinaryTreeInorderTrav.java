package Striver.BinaryTrees;

public class BinaryTreeInorderTrav {

    public static void inOrderTrav(Striver.BinaryTrees.BasicBTImpl.Node root) {
        if (root == null) {
            return;
        }
        inOrderTrav(root.left);
        System.out.print(root.data + " ");
        inOrderTrav(root.right);
    }

    public static void main(String[] args) {

        inOrderTrav(BasicBTImpl.basicBT());
    }
}
