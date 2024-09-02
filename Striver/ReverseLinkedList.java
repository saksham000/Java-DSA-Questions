package Striver;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    static Node reverseLinkedList(Node head) {
        Node tempHead = head;
        while (head.next != null) {
            head = head.next;
        }
        tempHead = head;

        return tempHead;
    }

    static void printlist(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node reveList = reverseLinkedList(head);
        printlist(reveList);
    }

}