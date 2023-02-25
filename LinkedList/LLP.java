class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

public class LLP {
    public static void main(String[] args) {
        Node start = new Node(0);
        Node p=start;

        for(int i=1;i<=10;i++){
            p.next=new Node(i);
            p=p.next;
        }
        // for(Node p1=start;p1!=null;p1=p1.next){
        //     System.out.println(p1.data);
        // }
        
        if(p==null){
            Node q=new Node(22);
            q=q.next;
        }
    }
    
}
