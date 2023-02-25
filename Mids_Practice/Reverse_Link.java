
class Node13{
    int data;
    Node13 next;

    Node13(int data){
        this.data=data;
    }

    Node13(int data,Node13 next){
        this.data=data;
        this.next=next;
    }
}



public class Reverse_Link {
    public Node13 reverse(Node13 head){
        if(head == null || head.next == null){
            return head;
        }
        Node13 newHead = reverse(head.next);
        head.next.next = head;
        head.next=null;

        return  newHead;
    }

    public static void main(String[] args) {
        Node13 start = new Node13(1);
        start.next=new Node13(2);
        start.next.next=new Node13(3);
        start.next.next.next = new Node13(4);

        Reverse_Link rl = new Reverse_Link();

        System.out.println(rl.reverse(start));
    }
}
