
class Node4{
    int data;
    Node4 next;
    Node4(int data){
        this.data = data;
        this.next=null;

    }
}

public class Sum_Av {
    public static void main(String[] args) {
        Node4 start = new Node4(2);
        Node4 p = start;
        for(int i=2; i<=50; i++){
            p.next = new Node4(i*2);
            p=p.next;
        }
        int counter=1;
        int sum=0;
        int avg = 0;
        for(p = start; p!=null; p=p.next){
            sum+= p.data;
            counter++;
        }

        System.out.println("Sum : "+sum);
        System.out.println("Average : "+sum/counter);
    }
}

