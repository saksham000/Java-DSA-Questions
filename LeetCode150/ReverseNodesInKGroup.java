package LeetCode150;

import Striver.LinkedList.BasicLLStruct;
import Striver.LinkedList.BasicLLStruct.Node;

public class ReverseNodesInKGroup {

    public static Node getKthNode(Node head, int k) {
        k -= 1;

        while (head != null && k > 0) {
            k--;
            head = head.next;
        }
        return head;
    }

    public static Node reverse(Node head) {

        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void revInKGroups(Node head, int k) {

        Node temp = head;
        Node prev = null;

        while (temp != null) {

            Node kthNode = getKthNode(temp, k);

            if (kthNode == null) {

                if (prev != null) {
                    prev.next = temp;
                }
                break;
            }

            Node next = kthNode.next;
            kthNode.next = null;

            reverse(temp);

            if (head == temp) {
                head = kthNode;
            } else {
                prev.next = kthNode;
            }

            prev = temp;
            temp = next;
        }
        BasicLLStruct.printLL(head);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int k = 2;
        revInKGroups(head, k);
    }
}
