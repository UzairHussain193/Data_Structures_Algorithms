
public class Linked {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }       // end of class Node
    public static Node middleNode(Node head) {
        Node p = head, q = head;
        while(q!=null && q.next!=null){
            p = p.next;
            q = q.next.next;
        }
        return p;
    }      // end of middleNode() method
    public static void display(Node start){
        Node p;
        for (p=start; p!=null; p=p.next){
            System.out.print(p.data+"  ");
        }
    }

    public static void main(String[] args) {

        Node start = new Node(1);
        Node p = start;
        for (int i=2; i<=7; i++){
            p.next = new Node(i);
            p =p.next;
        }


        display(start);
        System.out.println();
        System.out.println(middleNode(start).data);
    }
}