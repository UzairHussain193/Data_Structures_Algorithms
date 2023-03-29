

class Node{
    QueueNode next;
    String data;
    public Node(String data){
        this.data=data;
    }
}
class Linked_Stack{
    
    QueueNode head;
    int size;
    public Linked_Stack(){
        head=null;
        size=0;
    }
    void push(String data){
        QueueNode temp=new QueueNode(data);
        temp.next=head;
        head=temp;
        size++;
    }
    String peek(){
        if(head==null){
            System.out.println("List is empty");
        }
        return head.data;
    }
    String pop(){
        if(head==null){
            System.out.println("List is empty");
        }
        String result=head.data;
        size--;
        return result;
    }
    boolean isEmpty(){
        return (head==null);
    }
    int size(){
        return size;
    }
    public Object[] toArrayStack(){
        Object[] a=new Object[size];
        QueueNode current=head;
        int i;
        for(current=head,i=0;current!=null;current=current.next,i++){
            a[i]=current.data;
        }
        return a;
    }
   


    public static void main(String[] args) {
        Linked_Stack list=new Linked_Stack();
        list.push("Apples");
        list.push("Kiwis");
        list.push("Dragon Fruit");
        list.push("Pomegrnate");
        list.push("Grapes");
        list.push("Peach");
        list.push("Orange");       
        list.push("Guava");
        list.push("Chikoo");
        list.push("Malta");
        System.out.println(list.peek());
        list.pop();
        System.out.println(list.peek());
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.toArrayStack();
        System.out.println(list.peek());
       
        
    }
}