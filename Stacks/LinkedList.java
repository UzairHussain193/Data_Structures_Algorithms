public class LinkedList{
    Node head;
    int size;
    static class Node{
        int data;
        Node next;
        public Node(){

        }
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void getSize(){
        System.out.println("Size of liinkedlist is:  "+size);
    }
    public void add(int data) {          // adding elements in linkedlist, it adds at last generally
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addFirst(int data){
        Node newNode=new Node();
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void addLast(int data){
        Node p=new Node(data);
        if(isEmpty()){
            head = p;
        }else{
            Node temp=head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = p;
        }
        size++;
    }
    public void addAtPosition(int data, int position) {        // it insert at particular position by giving index
        Node newNode = new Node(data);
        if (position == 0) {
            addFirst(data);
        } else {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }
    public void deleteFirst(){
        if(!isEmpty()){
            head=head.next;
            size--;
        }
    }
    public void deleteLast(){
        if (!isEmpty()) {
            if (head.next == null) {
                head = null;
            } else {
                Node temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
            size--;
        }
    }
    public void deleteAtPosition(int position) {            // it deletes the element at particular postion
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            head = head.next;
        } else {
            Node current = head;
            int count = 0;
            while (count < position - 1) {
                current = current.next;
                count++;
            }
            current.next = current.next.next;
        }
        size--;
    }
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void replace(int predata,int newdata) {
        Node current = head;
        while (current != null) {
            if (current.data == predata) {
                current.data=newdata;
            }
            current = current.next;
        }
    }

    public int FindLargest(){
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        int max = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public int FindLowest(){
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        int min = head.data;
        Node current;
        for(current=head.next;current!=null;current=current.next){
            if(current.data<min){
                min=current.data;
            }
        }
        return min;
    }

    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    public Node copy(Node p){
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

    public void display() {             //method to display linkedlist
        Node current = head;
        System.out.print(" [ ");
        for(current=head;current!=null;current=current.next){
            System.out.print(current.data+" , ");
        }
        System.out.println(" ] ");
    }
    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        Node head=new Node();
        list.head=new Node(4);
        // Node p=head;
        list.add(23);
        list.addLast(43);
        list.addLast(99);
        list.addFirst(11);
        System.out.println(list.isEmpty());
        // list.getSize();
        list.display();        

        // list.replace(43, 27);
        // list.display();

        // System.out.println(list.FindLargest());
        // System.out.println(list.FindLowest());
        

        // list.addAtPosition(67, 3);
        // list.display();

        list.copy(head);
        list.display();

        // System.out.println("Reversing a linkedlist");
        // list.reverse(head);
        // list.display();
        // list.deleteAtPosition(3);
        // list.display();
        
    }
}