
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

public class Linklist {
    public static void main(String[] args) {
//        Node start = new Node(1);
//        start.next = new Node(2);
//        start.next.next = new Node(3);
//        start.next.next.next = new Node(4);
//        System.out.println(start);


       Node start = new Node(11);
       Node p = start;
       for(int i=1; i<5; i++){
           p.next = new Node(i*11);
           p=p.next;
           System.out.println(p);
       }


    }
}
