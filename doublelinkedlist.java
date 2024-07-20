public class doublelinkedlist {

    public static class node{
        int val;
        node next;
        node prev;
        public node(int val){
            this.val=val;
        }
    }

    public static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void displayrev(node tail){
        node temp=tail;
        while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.prev;
        }
        System.out.println();
    }

    public static void disprandom(node random){
        node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static node insertAtHead(node head,int x){
        node t=new node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    public static void insertAtEnd(node head,int x){
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        node t= new node(x);
        temp.next=t;
        t.prev=temp;
        
    }

    public static void insertAtIdx(node head,int idx,int x){
        node s=head;
        for(int i=1;i<=idx-1;i++){
        s=s.next;
        }
        node r=s.next;
        node t=new node(x);
        //s t r
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
        
    }

    public static node deletehead(node head){
        
        head=head.next;
        head.prev=null;
        return head;
       
        
        
        }
        public static void deletetail(node head){
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp=temp.prev;
            temp.next=null;
        }

        public static void deleteatIndex(node head,int idx){
            if(head==null){
                return;
            }
            if(idx==1){
                head=head.next;
                head.prev=null;
            }
            node temp=head;
            for(int i=1; i<idx;i++){
                temp=temp.next;
            }

            if(temp.next!=null){
              temp.next.prev=temp.prev;
              temp.prev.next=temp.next;
            }
           
            else{
            temp.prev.next=null;
            }
            

        }

    public static void main(String[] args) {
        //3 7 5 13 8
        node a = new node(3);
        node b = new node(7);
        node c = new node(5);
        node d = new node(13);
        node e = new node(8);
        //connect
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        // display(a);
        // displayrev(e);
        // disprandom(c);
        // node newhead=insertAtHead(a, 9);
        // display(newhead);
        // insertAtEnd(a, 32);
        // display(a);
        // insertAtIdx(a, 3, 54);
        // display(a);
        // 
        // deletetail(a);
        // display(a);
        // node newhead= deletehead(a);
        // display(newhead);
        deleteatIndex(a, 3);
        display(a);


    }
}
