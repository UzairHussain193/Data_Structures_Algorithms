import java.util.List;

public class List_Mids {
    int size;
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(){

        }
        public Node(int data){
            this.data=data;
        }
    }

    public void Size(){
        System.out.println("Size: "+size);
    }
    public boolean isEmpty(){
        return (head==null);
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void addLast(int data){
        Node p=new Node(data);
        if(isEmpty()){
            p=head;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=p;
        }
        size++;
    }
    public void addatAny(Node head, int pos, int data){
        Node p=new Node(data);
        if(pos==0){
            addFirst(data);
        }else{
            Node temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            p.next=temp.next;
            temp.next=p;
        }
        size++;
    }
    public void deleteFirst(){
        if(!isEmpty()){
            head=head.next;
        }
        size--;
    }
    public void deleteLast(){
        if(!isEmpty()){
            if(head.next==null){
                head=null;
            }else{
                Node temp=head;
                while(temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;
            }
                size--;
            }
        }

    public void deletePos(int pos){
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
    
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position");
            return;
        }
            
        if (pos == 0) {
            head = head.next;
        } 
        else{
            Node current=head;
            int count=0;
            while(count<pos-1){
                current=current.next;
                count++;
            }
            current.next=current.next.next;
        }
        size--;
    }
    public boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void replace(int predata,int newdata) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == predata) {
                temp.data=newdata;
            }
            temp = temp.next;
        }
    }

    public void display(Node head) {             //method to display linkedlist
        Node current = head;
        System.out.print(" [ ");
        for(current=head;current!=null;current=current.next){
            System.out.print(current.data+" , ");
        }
        System.out.println(" ] ");
    }

    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            curr.next=next;
            next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        

        int [] a = {5, 6, 78, 98, 10};

        Node start= new Node(a[0]);
        Node p = start;
        for(int i=1; i<a.length; i++){
            p.next = new Node(a[i]);
            p = p.next;
        }
        List_Mids d= new List_Mids();
        d.display(start);

        Node b = reverse(start);
        d.display(b);

        // Node q = b;
        // for(q=b; q!=null; q=q.next){
        //     System.out.println(q.data);
        // }

}
    

}