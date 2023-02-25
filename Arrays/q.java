class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
    }
    Node(int d, Node n){
        data=d;
        next=n;
    }

    int size(Node start){
        int size=1;
        for(Node n=start;n.next!=null;n=n.next){
            size++;
        }
        return size;
    }

    Node insertAtFirst(Node start, int d){
        Node n=new Node(d);
        n.next=start;
        return n;
    }

    Node insertAtLast(Node start, int d){
        Node n;
        for(n=start;n.next!=null;n=n.next){

        }
        n.next=new Node(d);
        return start;
    }

    Node insertAtAny(Node start, int p, int d){

        if(p<=(size(start)+1) && p>0){
            if(p==1){
                start=insertAtFirst(start, d);
                return start;
            }
            else if(p==(size(start)+1)){
                start=insertAtLast(start, d);
                return start;
            }
            else{
                Node n=start;
                Node temp=n;
                //Node temp =n;

                int count=1;
                for( n=start;n!=null;n=n.next){
                    if(count==p-1){
                        break;
                    }
                    count++;
                }
                n.next=new Node(d, n.next);
                return n;
            }
        }
        else{
            System.out.println("Invalid Position");
        }
        return start;
    }
}

public class q {
    public static void main(String[] args) {
        int[] a={1,2,3,4};

        Node start=new Node(a[0]);
        Node n=start;

        for(int i=1;i<a.length;i++){
            n.next=new Node(a[i]);
            n=n.next;
        }

        start=start.insertAtAny(start, 2, 0);
        
        for(n=start;n!=null;n=n.next){
            System.out.println(n.data);
        }
    }
}