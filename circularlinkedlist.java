public class circularlinkedlist {

    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
        }

    }

    public static node deleteHead(node head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else if (head.next == head) {
            return null;
        } else {
            node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
            return head;
        }
    }
    

    public static void display(node head){
        System.out.print(head.data+" ");
        node temp=head.next;
        while(temp!=head){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    
    System.out.println();
    }
    public static void main(String[] args) {
        //3 7 5 13 8
        node a = new node(3);
        node b = new node(7);
        node c = new node(5);
        node d = new node(13);
        node e = new node(8);
        //connect
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;
        // deletehead(a);
        node newhead=deleteHead(a);
        display(newhead);
    }
    
}
