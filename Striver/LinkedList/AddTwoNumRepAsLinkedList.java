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
        next = null;
    }
}

public class AddTwoNumRepAsLinkedList {

    public static void addTwoNumRepAsLinkedList(Node list1, Node list2) {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        int carry = 0;
        while(list1 != null || list2 != null || carry == 1){
            int sum = 0;
            if(list1 != null){
                sum += list1.data;
                list1 = list1.next;
            }
            if(list2 != null){
                sum += list2.data;
                list2 = list2.next;
            }
            sum = sum + carry;
            carry = sum/10;
            Node newNode = new Node(sum%10);
            temp.next = newNode;
            temp = temp.next;
        }
        printList(dummyNode.next);
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {

        Node list1 = new Node(2);
        list1.next = new Node(4);
        list1.next.next = new Node(3);

        Node list2 = new Node(5);
        list2.next = new Node(6);
        list2.next.next = new Node(4);
        
        addTwoNumRepAsLinkedList(list1, list2);

    }

}
