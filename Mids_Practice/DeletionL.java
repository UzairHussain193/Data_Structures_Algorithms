
class Node6{
    int data;
    Node6 next;
    Node6(int data){
        this.data=data;
    }
    Node6(int data, Node6 next){
        this.data=data;
        this.next=next;
    }

    @Override
    public String toString() {
        return "Node6{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

public class DeletionL {
    Node6 delete(Node6 start,int x){
        if(start==null || start.data>x){
            return start;
        }
        if(start.data==x){
            return start.next;
        }
        for(Node6 p=start; p.next!=null; p=p.next){
            if(p.next.data>x){
                break;
            }
            if(p.next.data==x){
                p.next=p.next.next;
                break;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        DeletionL del = new DeletionL();
        Node6 start= new Node6(2);
        start.next= new Node6(4);
        start.next.next=new Node6(6);
        start.next.next.next=new Node6(8);

        System.out.println(del.delete(start,2));
    }
}
