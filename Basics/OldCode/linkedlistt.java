//create a simple linkedlist and print the values
import java.util.*;
public class linkedlistt{

    node head;
    static class node{
        int data;
        node next;

        node(int d){
            data = d;
            next = null;
        }
    }
    
    public void printlist(){
        node n = head;
        while (n != null) {
            System.out.print(n.data + "->");
            n = n.next;
            if(n == null){
                System.out.print("null");
            }
        }
    }
    public static void main(String arg[]){

        linkedlistt llist = new linkedlistt();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of head node");
        int h = input.nextInt();

        System.out.println("Enter the value of second node");
        int s = input.nextInt();

        System.out.println("Enter the value of theird node");
        int t = input.nextInt();

        llist.head = new node(h);
        node second = new node(s);
        node theird = new node(t);

        llist.head.next = second;
        second.next = theird;
        theird.next = null;

        llist.printlist();
        input.close();
    }
}