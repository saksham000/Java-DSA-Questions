package Striver.LinkedList;


public class BasicLLStruct {
    public static class Node{
        public int data;
        public Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void printLL(Node head){
        while (head != null) {
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println("null");
    }
}
