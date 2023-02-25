
class Node10{
    int data;
    Node10 next;

    Node10(int data){
        this.data=data;
    }
    Node10(int data,Node10 next){
        this.data=data;
        this.next=next;
    }

    @Override
    public String toString() {
        return "Node10{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}


public class DeleteLast {

    public Node10 deleteLast(Node10 start){
        if(start==null){
            return null;
        }
        for(Node10 i=start; i!=null; i=i.next){
            if(i.next==null){
                return null;
            }
            if(i.next.next==null){
                i.next=null;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        DeleteLast dl = new DeleteLast();

        Node10 start=new Node10(1);
        start.next=new Node10(2);
        start.next.next=new Node10(3);
        start.next.next.next=new Node10(4);

        System.out.println(dl.deleteLast(start));
    }
}
