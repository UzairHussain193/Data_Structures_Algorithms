
class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data=data;
        this.next=null;
    }

}

public class Traverse {
    public static void main(String[] args) {
        Node2 start = new Node2(11);
        Node2 p = start;
        for(int i =2; i<5; i++){
            p.next= new Node2(i*11);
            p = p.next;
        }
        for(Node2 q=start; q!=null; q=q.next){
            System.out.println(q.data);

        }
    }
}
