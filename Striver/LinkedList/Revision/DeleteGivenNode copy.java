package Striver.LinkedList.Revision;

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

public class DeleteGivenNode {

    public static void deleteNode(Node head, int data){
        Node resetNode = head;
        while (head.data != data) {
            head = head.next;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        printList(resetNode);

    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(66);
        head.next.next.next = new Node(3);

        deleteNode(head, 66);

    }

}
