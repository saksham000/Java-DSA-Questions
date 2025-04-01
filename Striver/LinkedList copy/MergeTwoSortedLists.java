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

public class MergeTwoSortedLists {

    public static void mergeTwoSortedLists(Node list1, Node list2) {

        Node dummyNode = new Node(-1);
        Node tempNode = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                tempNode.next = list1;
                list1 = list1.next;
            } else {
                tempNode.next = list2;
                list2 = list2.next;
            }
            tempNode = tempNode.next;
        }

        if (list1 != null) {
            tempNode.next = list1;
        } else {
            tempNode.next = list2;
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

        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);
        list1.next.next.next = new Node(9);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);
        list2.next.next.next = new Node(7);
        list2.next.next.next.next = new Node(8);

        mergeTwoSortedLists(list1, list2);

    }
}
