import java.text.BreakIterator;
import java.util.concurrent.DelayQueue;

class LP {
    static class Node{
        int data;
        Node next;
    
        Node(){
    
        }
        Node(int data){
            this.data=data;
        }   
    }
   
    static Node copy(Node p){
        Node q=new Node(p.data);
        Node temp=q;
        Node start=p;
        start=start.next;

        while(start!=null){
            temp.next=new Node(start.data);
            start=start.next;
            temp=temp.next;
        }
        return q;
    }
    public static Node insert(Node start,int x){
        Node p=start;
        while(p.next!=null){
            if(p.next.data>x){
                break;
            }
            p=p.next;
        }
        Node q=new Node(x);
        q.next=p.next;
        p.next=q;

        return start;

    }
    public static Node delete(Node start,int n){
        if(start==null || start.data>n){
            return start;
        }
        if(start.data==n){
            return start.next;
        }
        for(Node p=start;p.next!=null;p=p.next){
            if(p.next.data>n){
                break;
            }
            if(p.next.data==n){
                p.next=p.next.next;
                break;
            }
        }
        return start;
    }
    public static Node concat(Node p,Node q){
        Node start =p;
        Node i;
        for(i=start;i.next!=null;i=i.next){
        }
        i.next=q;
        return start;
    }
    public static Node replace(Node list, int i, int j){
        int counter=1;
        Node p=list;
        while(p!=null){
            if(counter==i){
                break;
            }
            p=p.next;
            counter++;
        }
        p.data=j;
        return list;
    } 
    public static void displayList(Node start) {
        Node p;
        for (p = start; p != null; p = p.next) {
            System.out.print(p.data + "  ");
        }
        System.out.println();
    }
    public static void displayList2(Node start,Node head) {
        Node p;
        Node q;
        for (p = start; p != null; p = p.next) {
            System.out.print(p.data + "  ");
        }
        for (q = head; q != null; q= q.next) {
            System.out.print(q.data + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node start=new Node(15);
        Node head = new Node(15);
        Node p=start;
        Node q=head;

        for(int i=1;i<=5;i++){
            p.next=new Node(i);
            p=p.next;
        }
        for(int i=10;i>5;i--){
            q.next=new Node(i);
            q=q.next;
        }

        // p.next=new Node(16);
        // p=p.next;
        // p.next=new Node(17);
        // p=p.next;

        // q.next=new Node(16);
        // q=q.next;
        // q.next=new Node(17);
        // q=q.next;


        // displayList(start);


        // Node a=LP.copy(start);
        // Node b=LP.copy(start);

        // Node h=a;
        // displayList(h);
        // Node k=b;
        // displayList(k);


        displayList(start);
        displayList(head);

        concat(p, q);
        displayList2(start,head);
        // replace(start, 5, 9);   // i is index num and j is number to replave at i
        // displayList(start);

        // displayList(start);
        // delete(start, 8);
        // displayList(start);
        // insert(start, 12);
        // displayList(start);
        // copy(p);

        


    }
        
}
