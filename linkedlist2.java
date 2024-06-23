//add at last and add last
import java.util.*;
public class linkedlist2{
    
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
        node h = head;
        while(h != null){
            System.out.print(h.data + "->");
            h = h.next;
            if(h == null){
                System.out.print("null");
                System.out.println();
            }
        }
    }

    public void addfirst(int data){
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;
    }

    public void addlast(int data){
        node newnode = new node(data);
        node headnode = head;
        while(headnode.next != null){
            headnode = headnode.next;
        }
        headnode.next = newnode;
    }

    public static void main(String arg[]){
        linkedlist2 list = new linkedlist2();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of head node");
        int h = input.nextInt();
        list.head = new node(h);

        System.out.println("Enter the value of second node");
        int s = input.nextInt();
        node second  = new node(s);

        System.out.println("Enter the value of theird node");
        int t = input.nextInt();
        node theird = new node(t);

        list.head.next = second;
        second.next = theird;
        list.printlist();

        System.out.println("Value to insert at first of node ?");
        int f = input.nextInt();
        list.addfirst(f);
        list.printlist();

        System.out.println("Value to insert at last of node");
        int l = input.nextInt();
        list.addlast(l);
        list.printlist();
        input.close();
    }
}