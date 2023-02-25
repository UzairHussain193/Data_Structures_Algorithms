
class Node9{
    int data;
    Node9 next;

    Node9(int data){
        this.data=data;
    }
    Node9(int data, Node9 next){
        this.data=data;
        this.next=next;
    }

    @Override
    public String toString() {
        return "Node9{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

public class Concate {

    public Node9 conCate(Node9 p, Node9 q){
        Node9 start= p;
        Node9 i;
        for(i=start; i.next!=null; i=i.next){

        }
        i.next=q;
        return start;
    }

    public static void main(String[] args) {
        Concate c = new Concate();

        Node9 p = new Node9(1);
        p.next=new Node9(2);
        p.next.next=new Node9(3);

        Node9 q = new Node9(4);
        q.next=new Node9(5);
        q.next.next=new Node9(6);


        System.out.println(c.conCate(q,p));
    }
}
