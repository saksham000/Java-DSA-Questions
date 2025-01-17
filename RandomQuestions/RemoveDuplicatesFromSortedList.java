package RandomQuestions;

import Striver.LinkedList.BasicLLStruct;
import Striver.LinkedList.BasicLLStruct.Node;

public class RemoveDuplicatesFromSortedList {

    public static void removeDupli(Node head) {
        Node currNode = head;

        while (currNode != null && currNode.next != null) {
            if (currNode.data == currNode.next.data) {
                currNode.next = currNode.next.next;
            } else {
                currNode = currNode.next;
            }
        }
        BasicLLStruct.printLL(head);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        removeDupli(head);
    }
}
