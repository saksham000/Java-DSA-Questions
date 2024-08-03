public class stack1 {
    static class node{
        int data;
        node next = null;

        node(int d){
            data = d;
        }
    }

    static class stack{
        static node head;
        public static boolean isempty(){
            return head == null;
        }

        public static void push(int data){
            node newnode = new node(data);
            newnode.next = head;
            head = newnode;
        }

        public static int pop(){
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            return head.data;
        }
    }
    public static void main(String arg[]){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop(); 
        }
    }
}
