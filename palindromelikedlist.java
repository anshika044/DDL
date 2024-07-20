public class palindromelikedlist {
    //doublylinkedlist
    public static class node{
        int val;
        node next;
        node prev;

        public node(int val){
            this.val=val;
        }

        public static class doublylinkedlist{
            node head=null;

            void insertatend(int val){
                node t=new node(val);
                if(head==null){
                 head=t;
                 return;
                }
                node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=t;
                t.prev=temp;
            }

            void display(){
                node temp=head;
                while(temp!=null){
                    System.out.print(temp.val+" ");
                    temp=temp.next;
                }
                
            }

            void insertatbegining(int val){
                node temp=new node(val);
                if(head==null){
                    head=temp;
                    return;
                }
                else{
                    temp.next=head;
                    head.prev=temp;
                    head=temp;
                }
                
            }

            boolean palindrome(node head){
                node temp=head;
                node s=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                node r=temp;
                while(s!=r){
                    if(s.val!=r.val){
                        return false;
                    }
                    else{
                        s=s.next;
                        r=r.prev;
                    }
                }
                return true;
            }
            
            
            
        }
       

        public static void main(String[] args) {
            doublylinkedlist list=new doublylinkedlist();
            list.head=new node(1);
            list.insertatend(4);
            list.insertatend(5);
            list.insertatend(9);
            list.insertatend(8);
            // list.insertatbegining(2);
            list.display();
            System.out.println( );
            if(list.palindrome(list.head)){
                System.out.println("yes palin");
            }
            else{
                System.out.println("noo");
            }
           
            

            
        }
    }
}

