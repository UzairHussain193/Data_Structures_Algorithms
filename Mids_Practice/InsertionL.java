
class Node5{
    int data;
    Node5 next;
    Node5(int data){
        this.data=data;

    }
    Node5(int data,Node5 next){
        this.data=data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node5{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

public class InsertionL{

    Node5 insert(Node5 start,int x){
        Node5 p = start;
        while(p.next!=null){

            if(start==null || start.data>x){
                start=new Node5(x,start);
            }
           else if(p.next.data>x){
                break;
            }
            p=p.next;
        }
        Node5 q = new Node5(x);
        q.next=p.next;
        p.next=q;

        return start;
    }

    public static void main(String[] args) {
        InsertionL LL = new InsertionL();
        Node5 start= new Node5(2);
        start.next= new Node5(4);
        start.next.next=new Node5(6);
        start.next.next.next=new Node5(8);


        System.out.println(LL.insert(start,1));

    }
}
