public class stack2{
    public static class node{
        int data;
        node next;

        node(int d){
            this.data = d;
            next = null;
        }
    }
    public static class stack{
        public static node head;

        public static boolean isempty(){
            return head == null;
        }
        public static void push(int data){
            node newnode = new node(data);
            if(isempty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        public static int pop(){
            if(isempty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isempty()){
                return -1;
            }
            return head.data;
        }
    }
}