//all operations
import java.util.*;
public class linkedlist3 {
    
    node head;
    static class node{
        int data;
        node next;

        node(int d){
            data = d;
            next = null;
        }
    }
    void addfirst(int data){
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;
    }

    void addgiven(int pos,int data) {
        node newnode = new node(data);
        int count = 1;
        node h = head;
        pos = pos - 1;
        if(pos == 0){
            System.out.println("Invalid position");
            return;
        }
            while(count != pos){
                h = h.next;
                count++;
            }
            newnode.next = h.next;
            h.next = newnode;
        }

    void addlast(int data){
        node newnode = new node(data);
        node currnode = head;
        while(currnode.next != null){
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }

    void printlist(){
        node h = head;
        while(h != null){
            System.out.print(h.data + "->");
            h = h.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String arg[]){
        linkedlist3 list = new linkedlist3();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of head node");
        int h = input.nextInt();
        list.head = new node(h);

        System.out.println("Enter the value of second node");
        int s = input.nextInt();
        node second = new node(s);

        System.out.println("Enter the value of theird node");
        int t = input.nextInt();
        node theird = new node(t);

        System.out.println("Enter the value of fourth node");
        int f = input.nextInt();
        node fourth = new node(f);

        list.head.next = second;
        second.next = theird;
        theird.next = fourth;
        list.printlist();

        System.out.println("Enter the value of position where you want to insert node");
        int p = input.nextInt();
        System.out.println("Enter the value of node");
        int v = input.nextInt();

        list.addgiven(p,v);
        list.printlist();

        System.out.println("Enter the value of node want to add at first");
        int ff = input.nextInt();
        list.addfirst(ff);
        list.printlist();

        System.out.println("Enter the value of node want to add at last");
        int ls = input.nextInt();
        list.addlast(ls); 
        list.printlist();
        input.close();
    }
}