package LeetCode150;

import Striver.LinkedList.BasicLLStruct;
import Striver.LinkedList.BasicLLStruct.Node;

public class RotateList {

    public static Node findNthNode(Node head, int k) {
        int count = 1;
        while (head != null) {
            if (count == k) {
                return head;
            }
            head = head.next;
            count++;
        }
        return null;
    }

    public static void rotate(Node head, int k) {

        int len = 1;
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        k = k % len;
        if (k == 0) {
            BasicLLStruct.printLL(head);
            return;
        }

        tail.next = head;

        Node newEnd = findNthNode(head, len - k);
        Node newHead = newEnd.next;
        newEnd.next = null;

        BasicLLStruct.printLL(newHead);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        rotate(head, 2);
    }
}
