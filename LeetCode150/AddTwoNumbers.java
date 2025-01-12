package LeetCode150;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddTwoNumbers {

    public static void addTwoNum(Node l1, Node l2) {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;
            Node newNode = new Node(sum%10);
            temp.next = newNode;
            temp = temp.next;
        }
        printLL(dummyNode.next);
    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);
        
        addTwoNum(l1, l2);
    }
}
