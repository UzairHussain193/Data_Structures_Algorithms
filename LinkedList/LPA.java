


public class LPA {
    static class Node {
        int data;
        Node next;
    
        public Node(int d) {
            data = d;
        }
    }
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node start = new Node(2);
        Node p = start;
        int sum = 0, counter = 0;

        for (int i = 4; i <=40; i += 4) {
            p.next = new Node(i);
            p = p.next;
        }
        for (Node p1 = start; p1 != null; p1 = p1.next) {
            System.out.print("  " + p1.data + "  ");
            sum += p1.data;
            counter++;
        }

        reverse(start);
        for(Node a=start;a!=null;a=a.next){
            System.out.println("  "+a.data+"  ");
        }
        
        

        
        System.out.println("\nthe sum of the numbers : " + sum);
        System.out.println("the average of the numbers : " + (sum / counter));
    }
}
