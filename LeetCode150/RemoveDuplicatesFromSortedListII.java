package LeetCode150;

import Striver.LinkedList.BasicLLStruct;
import Striver.LinkedList.BasicLLStruct.Node;

public class RemoveDuplicatesFromSortedListII {

    public static void removeDupli(Node head) {
        Node dummyNode = new Node(-1, head);
        Node prev = dummyNode;

        while (head != null) {
            if (head.next != null && head.data == head.next.data) {
                while (head.next != null && head.data == head.next.data) {
                    head = head.next;
                }
                prev.next = head.next;
            } else {
                prev = prev.next;
            }
            head = head.next;
        }
        BasicLLStruct.printLL(dummyNode.next);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(5);
        removeDupli(head);
    }
}
