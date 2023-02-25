
class Node8{
    int data;
    Node8 next;

    Node8(int data){
        this.data=data;
    }
    Node8(int data,Node8 next){
        this.data=data;
        this.next=next;
    }

    @Override
    public String toString() {
        return "Node8{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

public class Replace {
    public Node8 replace(Node8 list,int i,int x){
        int counter=1;
        Node8 p = list;
        while(p!=null){
            if(counter==i)
                break;
                p=p.next;
                ++counter;

        }
//        p.next= new Node8(x,p.next.next);
        p.data=x;
        return list;
    }

    public static void main(String[] args) {
        Replace rr = new Replace();

        Node8 start= new Node8(1);
        start.next=new Node8(2);
        start.next.next=new Node8(3);
        start.next.next.next=new Node8(4);

        System.out.println(rr.replace(start,1,9));
    }
}
