import javax.lang.model.type.NullType;

class test{
    static class Node{
    int data;
    Node next;
    static int counter;
    static float sum;
    static float average;

    Node(){

    }
    Node(int d){
        data=d;
    }

    static float averageList(Node head){
        Node p=head;
        
        for(p=head;p!=null;p=p.next){
            sum+=p.data;
            counter++;
            if(counter==5){
                break;
            }
        }
        average=(sum/counter);
        return average;
    }
    static float  avaerageArray(int[] arr){
        float sumA=0;
        int counterA=0;
        float averageA;
        for(int i=0;i<arr.length;i++){
            sumA+=arr[i];
            counterA++;
            if(counterA==5){
                break;
            }
        }
        averageA=(sumA/counterA);
        return averageA;

    }

    public static void main(String[] args) {
        int[] array={9,7,16,25,35,45};
        Node start=new Node(7);
        Node p=start;

        p.next=new Node(9);
        p=p.next;
        p.next=new Node(16);
        p=p.next;
        p.next=new Node(25);
        p=p.next;
        p.next=new Node(35);
        p=p.next;
        p.next=new Node(45);
        p=p.next;

        System.out.println("    Elements in Array are: ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println();
        System.out.println("    Elements in linkedlist are: ");
        for(p=start;p!=null;p=p.next){
            System.out.println(p.data+" ");
        }
        System.out.println();

        System.out.println("Average of Linkedlist is "+averageList(start));
        System.out.println("Average of array is:");
        System.out.println(avaerageArray(array));


    }

}
}