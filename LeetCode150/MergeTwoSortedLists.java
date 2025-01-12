package LeetCode150;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MergeTwoSortedLists {
    
    public static void mergeLL(Node l1, Node l2){
        Node dummyNode = new Node(-1);
        Node tempNode = dummyNode;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tempNode.next = l1;
                l1 = l1.next;
            }else{
                tempNode.next = l2;
                l2 = l2.next;
            }
            tempNode = tempNode.next;
        }
        if (l1 != null) {
            tempNode.next = l1;
        }else{
            tempNode.next = l2;
        }
        printLL(dummyNode.next);
    }

    public static void printLL(Node head){
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.next = new Node(2);
        l1.next.next = new Node(4);
        Node l2 = new Node(1);
        l2.next = new Node(3);
        l2.next.next = new Node(4);
        mergeLL(l1, l2);
    }
}
