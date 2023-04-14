package Finals;

interface Queue{
    public void add(Object obj);
    public Object first();
    public Object remove();
    public int size();
}
class Queue_Node{
    Object obj;
    Queue_Node next=this;
    Queue_Node prev=this;
    Queue_Node(Object obj){
        this.obj=obj;
    }
    Queue_Node(Object obj, Queue_Node prev, Queue_Node next){
        this.obj=obj;
        this.prev=prev;
        this.next=next;
    }
}
public class Linked_Queue implements Queue{
    Queue_Node head= new Queue_Node(null);
    int size;

    public void add(Object obj){
        head.prev.next= new Queue_Node(obj,head,head.prev);
        head.prev=head.prev.next;
        size++;
    }
    public Object first(){
        if(size==0){
            throw new IllegalStateException();
        }
        return head.next.obj;
    }
    public Object last(){
        if(size==0){
            throw new IllegalStateException();
        }
        return head.prev.obj;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public boolean equals(Object object){
        if(size==0){
            throw new IllegalStateException();
        }
        for(Queue_Node temp=head.next;temp!=null;temp=temp.next){
            if(temp.obj.equals(object)){
                return true;
            }
        }
        return false;
    }
    public Object findMiddle() {
        if (isEmpty()) {
            return null;
        }
        Queue_Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.obj;
    }
    
    public Object remove(){
        if(size==0){
            throw new IllegalStateException();
        }
        Object t = head.next.obj;
        head.next=head.next.next;
        head.next.prev=head;
        size--;
        return t;
    }
    public void Print(){
        Queue_Node a= head.next;
        int i=0;
        while(a!=head && i<=size-1){
            System.out.println((i+1)+" : "+a.obj);
            a=a.next;
            i++;
        }
    }
    public static void main(String[] args) {
        Linked_Queue l = new Linked_Queue();
        Object[] array= {"uzair","Razi","Abbas","LAHAD","Bilal"};

        for(int i=0;i<array.length;i++){
            l.add(array[i]);
        }
        
        System.out.println("First : "+l.first());
        System.out.println("Last : "+ l.last());
        System.out.println("Empty ? : "+l.isEmpty());
        System.out.println("Size : "+l.size());
        System.out.println("Equals (abbas) ? : "+l.equals("abbas"));
        l.Print();
        // Object mid = l.findMiddle();
        // System.out.println("Middle : "+mid);
        // System.out.println("After removing top most element : "+l.remove());
        // l.Print();

    }
}
