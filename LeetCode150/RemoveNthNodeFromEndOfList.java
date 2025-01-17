package LeetCode150;

import Striver.LinkedList.BasicLLStruct;
import Striver.LinkedList.BasicLLStruct.Node;

public class RemoveNthNodeFromEndOfList {

    public static void removeNode(Node head, int n) {

        Node fast = head, slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = fast;

        BasicLLStruct.printLL(head);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        removeNode(head, 2);
    }
}
