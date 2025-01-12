package LeetCode150;

class Node {
    int data;
    Node next;
    Node random;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {

    public static void printLL(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print("Node value: " + current.data);
            if (current.random != null) {
                System.out.print(", Random points to: " + current.random.data);
            } else {
                System.out.print(", Random points to: null");
            }
            System.out.println();
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node first = new Node(7);
        Node second = new Node(13);
        Node theird = new Node(11);
        Node fourth = new Node(10);
        Node fiveth = new Node(1);

        first.next = second;
        second.next = theird;
        theird.next = fourth;
        fourth.next = fiveth;

        second.random = first;
        // theird.random = 
    }
}
