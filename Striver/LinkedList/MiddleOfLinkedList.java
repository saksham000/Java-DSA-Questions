package Striver.LinkedList;

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

public class MiddleOfLinkedList {

    public static Node middelofLinkedList(Node head) {
        Node fast = head.next;
        Node slow = head;

        while(fast != null && fast.next != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return(slow);
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
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node middle = middelofLinkedList(head);
        System.out.println(middle.data);

    }

}
