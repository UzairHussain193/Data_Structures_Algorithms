
class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data = data;
        this.next=null;

    }
}

public class EvenNo {
    public static void main(String[] args) {
        Node3 start = new Node3(2);
        Node3 p = start;
        for(int i=2; i<=50; i++){
            p.next = new Node3(i*2);
            p=p.next;
        }
          int counter=1;
        for(p = start; p!=null; p=p.next){
            System.out.println(p.data);
            counter++;
        }
        System.out.println("Counter : "+counter);
    }
}
