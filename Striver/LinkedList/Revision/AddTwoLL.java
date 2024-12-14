package Striver.LinkedList.Revision;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddTwoLL {

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void addTwoNum(Node li1, Node li2) {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        int carry = 0;
        while (li1 != null || li2 != null || carry == 1) {
            int sum = 0;
            if (li1 != null) {
                sum += li1.data;
                li1 = li1.next;
            }
            if (li2 != null) {
                sum += li2.data;
                li2 = li2.next;
            }

            sum = sum + carry;
            carry = sum / 10;
            Node newNode = new Node(sum % 10);
            temp.next = newNode;
            temp = temp.next;
        }
        printList(dummyNode.next);
    }

    public static void main(String[] args) {
        Node li1 = new Node(2);
        li1.next = new Node(4);
        li1.next.next = new Node(3);

        Node li2 = new Node(5);
        li2.next = new Node(6);
        li2.next.next = new Node(4);

        addTwoNum(li1, li2);
    }

}
