import java.util.*;
public class linkedlist4 {
    node head;
    static class node{
        int data;
        node next;

        node(int d){
            data = d;
            next = null;
        }
    }

    void link(int data){
        node newnode = new node(data);
        node h = head;

        if(head == null){
            head = newnode;
            return;
        }
        while(h.next != null){
            h = h.next;
        }
        h.next = newnode;
        newnode = h;
    }

    void printlist(){
        node h = head;
        while(h != null){
            System.out.print(h.data + "->");
            h = h.next;
        }
        System.out.print("null");
    }
    public static void main(String arg[]){
        linkedlist4 list = new linkedlist4();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of linkedlist");
        int size = input.nextInt();
        System.out.println("Enter the elements of linkedlist");
        for(int i=0;i<size;i++){
            int num = input.nextInt();
            list.link(num);
        }
        list.printlist();
        input.close();
    }
}
