package Striver.BinaryTrees;

import java.util.ArrayList;
import java.util.List;

import Striver.BinaryTrees.BasicBTImpl.Node;

public class PrintRootToNodePath {
 
    public static boolean findPath(Node root,List<Integer> ans, int t){
        if (root == null) {
            return false;
        }

        ans.add(root.data);

        if (root.data == t) {
            return true;
        }

        if (findPath(root.left, ans, t)|| findPath(root.right, ans, t)) {
            return true;
        }

        ans.remove(ans.size()-1);

        return false;
    }

    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        findPath(BasicBTImpl.basicBT(), ans, 4);
        for(int i : ans){
            System.out.print(i +  " ");
        }
    }

}
