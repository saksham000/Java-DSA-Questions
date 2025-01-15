package LeetCode150;
import Striver.LinkedList.BasicLLStruct;
import Striver.LinkedList.BasicLLStruct.Node;

public class ReverseLinkedListII {

    public static void reverseLL(Node head, int left, int right){

        if (head == null || left == right) {
            System.out.println(head);
        }

        BasicLLStruct.Node dummyNode = new Node(-1);
        dummyNode.next = head;
        BasicLLStruct.Node prev = dummyNode;

        for(int i=0;i<left-1;i++){
            prev = prev.next;
        }

        BasicLLStruct.Node curr = prev.next;
        for(int i = 0; i< right-left;i++){
            BasicLLStruct.Node 
            temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }
        BasicLLStruct.printLL(dummyNode.next);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        int left = 2, right = 5;
        reverseLL(head,left,right);
    }
    
}
