
interface Queue{
    public void add(Object obj);
    public Object first();
    public Object remove();
    public int size(); 
}

public class LinkedQueue implements Queue{
    private Node head=new Node(null);
    private int size;
    private static class Node{
        Object object;
        Node prev=this;
        Node next=this;
        Node(Object obj){
            this.object=obj;
        }
        Node(Object obj, Node n,Node p){
            object=obj;
            next=n;
            prev=p;
        }
    } 
    @Override
    public int size(){
        return size;
    }
    @Override
    public Object first(){
        if(size==0){
            throw new IllegalStateException();
        }
        return head.next.object;
    }
    @Override
    public void add(Object obj){
        head.prev.next=new Node(obj,head,head.prev);
        head.prev=head.prev.next;
        size++;
    }
    @Override
    public boolean equals(Object obj) {
        if(size==0){
            throw new IllegalStateException();
        }
        for(Node t=head.next;t!=null;t=t.next){
            if(t.object.equals(obj)){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        StringBuilder b=new StringBuilder("[");
        for(Node t=head.next;t!=null;t=t.next){
            b.append(t.object);
            if(t.next!=head){
                b.append(",");
            }
        }
        b.append("]");
        String s=b.toString();
        return s;       
    }
    public Object last(){
        if(size==0){
            throw new IllegalStateException();
        }
        return head.prev.object;
    }
    @Override
    public Object remove(){
        if(size==0){
            throw new IllegalStateException();
        }
        Object temp=head.next.object;
        head.next=head.next.next;
        head.next.prev=head;
        size--;
        return temp;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public Object[] toArray(){
        Object[] aa=new Object[size];
        Node t=head.next;
        for(int i=0;i<size;i++){
            aa[i]=t.object;
            t=t.next;
            
        }
        return aa;
    }
    
}
