package Finals;

class StackNode{
    StackNode next;
    Object data;
    StackNode(Object data){
        this.data=data;
    }
}
public class Linkedstack {
    StackNode head;
    int size;
    Linkedstack(){
        this.head=null;
        size=0;
    }
    public void push(Object data){
        StackNode temp=new StackNode(data);
        temp.next=head;
        head=temp;
        size++;
    }
    public Object peek(){
        if(head==null){
            System.out.println("Empty Stack");
        }
        return head.data;
    }
    public Object pop(){
        if(head==null){
            System.out.println("Empty Stack");
        }
        Object result=head.data;
        size--;
        return result;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public void display(){
        StackNode h=head;
        int i=0;
        System.out.println("\tPrinting elements stored in stack.");
        while(h!=null){
            System.out.println((i+1) +" : "+ h.data);
            h=h.next;
            i++;
        }
    }
    public String[] toArrayStack(){
        String[] arr = new String[size+1];
        StackNode curr=head;
        int i=0;
        for(curr=head,i=0;curr!=null;curr=curr.next,i++){
            arr[i]=(String)curr.data;
        }
        return arr;
    }
    public static void main(String[] args) {
        Linkedstack  l = new Linkedstack();
        l.push("Uzair");
        l.push("Abbas");
        l.push("Lahad");

        System.out.println("In peek: "+l.peek());
        System.out.println("In pop: "+l.pop());
        l.display();

    }
}
