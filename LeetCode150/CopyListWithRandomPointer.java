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

    public static void copyWithRandom(Node head){
        Node temp = head;
        
        while(temp != null){
            Node newNode = new Node(temp.data);
            newNode.next = temp.next;
            temp.next = newNode;
            
            temp = newNode.next;
        }
        
        temp = head;
        while(temp != null){
            Node copyNode = temp.next;
            if(temp.random != null){
                copyNode.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        
        temp = head;
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        while(temp != null){
            res.next = temp.next;
            temp.next = temp.next.next;
            
            res = res.next;
            temp = temp.next;
        }
        printLL(dummyNode.next);
    }

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
        theird.random = fiveth;
        fourth.random = theird;
        fiveth.random = first;

        copyWithRandom(first);
    }
}
