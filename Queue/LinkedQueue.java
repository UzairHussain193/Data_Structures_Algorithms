
interface Queue{
    public void add(Object obj);
    public Object first();
    public Object remove();
    public int size(); 
}
class QueueNode{
    Object object;
    QueueNode prev=this;
    QueueNode next=this;
    QueueNode(Object obj){
        this.object=obj;
    }
    QueueNode(Object obj, QueueNode n,QueueNode p){
        object=obj;
        next=n;
        prev=p;
    }
} 
public class LinkedQueue implements Queue{
    QueueNode head=new QueueNode(null);
    private int size;

    
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
        head.prev.next=new QueueNode(obj,head,head.prev);
        head.prev=head.prev.next;
        size++;
    }
    @Override
    public boolean equals(Object obj) {
        if(size==0){
            throw new IllegalStateException();
        }
        for(QueueNode t=head.next;t!=null;t=t.next){
            if(t.object.equals(obj)){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        StringBuilder b=new StringBuilder("[");
        for(QueueNode t=head.next;t!=null;t=t.next){
            b.append(t.object);
            if(t.next!=head){
                b.append(",");
            }
        }
        b.append("]");
        String s=b.toString();
        return s;       
    }
    public void display(){
        QueueNode a= head.next;
        int i=0;
        while(a!=head){
            System.out.println((i+1)+" : "+a.object);
            a=a.next;
            i++;
        }
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
        QueueNode t=head.next;
        for(int i=0;i<size;i++){
            aa[i]=t.object;
            t=t.next;
        }
        return aa;
    }
    public static void main(String[] args) {
        LinkedQueue a = new LinkedQueue();
        Object[] arr= {"Abbas","LAHAD","uzair","Razi"};

        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }
        // System.out.println(a.first());
        // System.out.println(a.last());
        a.display();
        

    }
    
}
