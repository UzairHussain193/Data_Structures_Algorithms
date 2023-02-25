class Node{
    Node next;
    int data;
        public Node(int i) {
        data=i;
        }	
}
    public class Q2 { 
    
          public static void main(String[] args) {
              //intilizatiing
              Node head = new Node(5);
                head.next = new Node(7);
                head.next.next = new Node(9);
                head.next.next.next = new Node(11);
                Node start2 = new Node(29);
                start2.next = new Node(35);
                start2.next.next = new Node(45);
    
                int high = head.data;
                int sum = 0;
    
                for (Node j = head; j != null; j = j.next) {
                  sum += j.data;
                  if (j.data > high) {
                    high = j.data;
                  }
                }
                for (Node j = start2; j != null; j = j.next) {
                  sum += j.data;
                  if (j.data > high) {
                    high = j.data;
                  }
                }
    System.out.println("Highest number is "+high);
                System.out.println("Sum of the two linkedlist is "+sum);
                ;
    
    
    }
    
}
