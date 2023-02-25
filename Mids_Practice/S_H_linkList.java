
class Node12{
    Node12 next;
    int data;
    public Node12(int data) {
        this.data=data;
    }
}


public class S_H_linkList {


        public static void main(String[] args) {
            //intilizatiing
//            Node12 head = new Node12(5);
//            head.next = new Node12(7);
//            head.next.next = new Node12(9);
//            head.next.next.next = new Node12(11);
//            Node12 start2 = new Node12(29);
//            start2.next = new Node12(35);
//            start2.next.next = new Node12(45);
//
//            int high = head.data;
//            int sum = 0;
//
//            for (Node12 j = head; j != null; j = j.next) {
//                sum += j.data;
//                if (j.data > high) {
//                    high = j.data;
//                }
//            }
//            for (Node12 j = start2; j != null; j = j.next) {
//                sum += j.data;
//                if (j.data > high) {
//                    high = j.data;
//                }
//            }
//            System.out.println("Highest number is "+high);
//            System.out.println("Sum of the two arrays is "+sum);


            Node12 start1 = new Node12(3);
            start1.next = new Node12(5);
            start1.next.next = new Node12(7);

            Node12 start2 = new Node12(2);
            start2.next = new Node12(4);
            start2.next.next = new Node12(6);

            int high = start1.data;
            int sum=0;

            for(Node12 i=start1; i!=null; i=i.next){
                sum+= i.data;
                if(i.data>high){
                    high=i.data;
                }
            }
            for(Node12 i=start2; i!=null; i=i.next){
                sum+= i.data;
                if(i.data>high){
                    high=i.data;
                }
            }

            System.out.println("The highest No: is "+high);
            System.out.println("the sum of 2 linklists : "+sum);
        }
}

