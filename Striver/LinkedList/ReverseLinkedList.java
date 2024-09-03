    package Striver.LinkedList;

    // For Revision use this link (Two Pointer Approch)
    // https://leetcode.com/problems/reverse-linked-list/solutions/5612752/step-by-step-explained-with-images-easiest-to-understand-java-c-python-javascript-go-codes/

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
           Node curr = head;
           Node next = null;
           Node prev = null;

           while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
           }
           head = prev;
           return head;
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