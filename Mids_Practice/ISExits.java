
class Node7{
    int data;
    Node7 next;
    Node7(int data){
        this.data=data;
    }
}

public class ISExits {
    public boolean isExists(int val,Node7 start){
        if(start==null){
            return false;
        }
        while(start!=null){
            if(start.data==val){
                return true;
            }

                start=start.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ISExits is = new ISExits();
        Node7 p = new Node7(3);
        p.next=new Node7(5);
        p.next.next=new Node7(7);
        System.out.println(is.isExists(5,p));
    }
}
