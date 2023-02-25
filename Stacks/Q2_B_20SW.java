   // end of class Node

public class Q2_B_20SW {
    static class Node{
        public Node next;
        public int data;
        public Node(){

        }
        public Node(int data){
            this.data = data;
        }
    } 
    public static boolean search(Node head,int d){
        for(Node p=head;p!=null;p=p.next){
            if(p.data==d){
                return true;
            }
        }
        return false;
    }
    public static int sum(Node head){
        int sum=0;
        for(Node a=head;a!=null;a=a.next){
            sum+=a.data;
        }
        return sum;
    }
    public static Node merge(Node a,Node q){
            Node p = a;
            for (p=a; p.next!=null; p=p.next){

            }  // end of for loop
            p.next = q;
            return a;
        }   
    public static void print(Node head){
        for (Node p=head; p!=null; p=p.next){
            if (p.next==null){
                System.out.println(p.data+" -> null");
            }
            else{
                System.out.print(p.data+" -> ");
            }
        }
    }   
    public static void main(String[] args) {

        int [] array = {4, 15, 6, 7, 12, 36};
        Node list1 = new Node(array[0]);
        Node p = list1;
        for (int i=1; i<array.length; i++){
            p.next = new Node(array[i]);
            p = p.next;
        }

        // List 2
        int [] array2 = {3, 10, 4, 50};
        Node list2 = new Node(array2[0]);
        p = list2;
        for (int i=1; i<array2.length; i++){
            p.next = new Node(array2[i]);
            p = p.next;
        }
        print(list1);
        print(list2);

        System.out.println("Sum of list 1 is : "+sum(list1));
        System.out.println("Sum of list 2 is : "+sum(list2));

        System.out.println(search(list1, 7));
        System.out.println(search(list2, 98));

        Node temp=merge(list1, list2);
        print(temp);

    }
}