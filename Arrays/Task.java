import java.util.LinkedList;

class Node{
    int data;
    Node next;

    Node(){
        data=0;
    }
    Node(int data){
        this.data=data;
    }
}

class Task{
    static Node head;
   
    static int size(Node start){
        int size=0;
        for(Node n=start;n!=null;n=n.next){
            size++;
        }
        return size;
    }
    public void addfirst(int data){
        Node newNode=new Node(data);
        Node temp=head;
        head=newNode;
        newNode.next=temp;
    }  
    static Node addLast(Node head,int data) {
        Node newNode;
        for(newNode=head;newNode!=null;newNode=newNode.next){

        }
        newNode=new Node(data);
        return head;
    }
    public static void insertAtAny(Node start,int data,int pos){
        if(pos<=size(start)){
       
        }

    }
    public static void main(String[] args) { 
        LinkedList l=new LinkedList();       
        Node head=new Node(2);
        Node n=head;
        n.next=new Node(16);
        n=n.next;
        n.next=new Node(17);
        n=n.next;

start.addFirst( 32);
        addLast(n, 5);

        Node p1;
        for(p1=head;p1!=null;p1=p1.next) {
            System.out.print("  " + p1.data + "  ");
        }

        // l.addFirst(n, 32);
        // l.addLast(n, 5);

    }
}