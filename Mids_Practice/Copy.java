
class Node11{
    int data;
    Node11 next;

    Node11(int data){
        this.data=data;
    }
    Node11(int data,Node11 next){
        this.data=data;
        this.next=next;
    }

    @Override
    public String toString() {
        return "Node11{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

public class Copy {
    public Node11 copy(Node11 p){
        Node11 q= new Node11(p.data);
        Node11 temp=q;
        Node11 start = p;
        start=start.next;
        while(start!=null){
            temp.next = new Node11(start.data);
            start = start.next;
            temp=temp.next;
        }
        return q;
    }

    public static void main(String[] args) {
        Copy cc = new Copy();
        Node11 p = new Node11(11);
        p.next=new Node11(22);
        p.next.next = new Node11(33);
        p.next.next.next = new Node11(44);

        System.out.println(cc.copy(p));
    }
}
